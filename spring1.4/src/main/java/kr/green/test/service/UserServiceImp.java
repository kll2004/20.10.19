package kr.green.test.service;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.green.test.dao.UserDao;
import kr.green.test.vo.UserVo;

@Service
public class UserServiceImp implements UserService{
	@Autowired
	private UserDao userDao;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private JavaMailSender mailSender;
	
	
	@Override
	public String getEmail(String id) {
		UserVo user = userDao.getUser(id);
		//id와 일치하는 회원 정보가 없으면
		if(user == null) {
			return null;
		}
		//아이디와 일치하는 회원이 있으면
		return user.getEmail();
	}

	@Override
	public UserVo getUser(String id) {
		UserVo user = userDao.getUser(id);
		return user;
	}

	@Override
	public UserVo isUser(String id, String pw) {
		UserVo user = userDao.getUser(id);
		//id와 일치하는 회원 정보가 없으면
		if(user==null) {
			return null;
		}
		//id와 일치하는 회원 정보가 있으면 비밀번호를 비교하여 확인
		if(passwordEncoder.matches(pw, user.getPw())) {
			return user;//회원
		}
		return null;//비밀번호가 달라서 회원 아님
	}
	@Override
	public boolean signup(UserVo user) {
		UserVo tmp = userDao.getUser(user.getId());
		//이미 가입된 회원이면 회원가입 진행 불가
		if(tmp != null) {
			return false;
		}
		//가입된 회원이 아니면 회원 가입을 진행
		String encPw = passwordEncoder.encode(user.getPw());
		user.setPw(encPw);
		userDao.insertUser(user);
		return true;
	}

	@Override
	public UserVo getUser(HttpServletRequest request) {
		return (UserVo)request.getSession().getAttribute("user");
	}
	@Override
	public void updateUser(UserVo user) {
		if(user == null)
			return;
		String encodepw = passwordEncoder.encode(user.getPw());
		user.setPw(encodepw);
		userDao.updateUser(user);
		//받아온 회원정보의 비밀번호를 암호화하여 재설정
	}

	@Override
	public void sendMail(String title, String content, String email) {
		try {
	        MimeMessage message = mailSender.createMimeMessage();
	        MimeMessageHelper messageHelper 
	            = new MimeMessageHelper(message, true, "UTF-8");

	        messageHelper.setFrom("green@naver.com"); 
	        messageHelper.setTo(email);     		
	        messageHelper.setSubject(title); 		
	        messageHelper.setText(content);  			

	        mailSender.send(message);
	    } catch(Exception e){
	        System.out.println(e);
	    }
	}
}
