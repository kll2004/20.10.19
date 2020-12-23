package review2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<word> list = new ArrayList<word>();
		
		System.out.print("입력단어갯수 : ");
		int size = scan.nextInt();		
		while(list.size()<size) {
			System.out.print("단어 : ");
			String word = scan.next();
			System.out.print("의미 : ");
			String mean = scan.next();
			list.add(new word(word,mean));
		}		
		Collections.sort(list);
		for(word tmp : list) {
			System.out.println(tmp);
		}
		/*입력한 단어 중 하나를 검색하여 출력하는 코드를 작성*/
		System.out.print("검색 : ");
		String search = scan.next();
		for(word tmp:list) {
			if(tmp.equals(search)) {
				System.out.print("검색 단어 : ");
				System.out.println(tmp);
			}
		}
		scan.close();
	}
}
class word implements Comparable{
	private String word;
	private String mean;
	public word(String word, String mean) {
		this.word = word;
		this.mean = mean;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}
	@Override
	public int compareTo(Object o) {
		word word = (word)o;
		return this.word.compareTo(word.word);
	}
	@Override
	public String toString() {
		return "[" + word + ":" + mean + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mean == null) ? 0 : mean.hashCode());
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		if(obj instanceof String) {
			return word.equals(obj);
		}
		word other = (word) obj;
		if (mean == null) {
			if (other.mean != null)
				return false;
		} else if (!mean.equals(other.mean))
			return false;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}
}