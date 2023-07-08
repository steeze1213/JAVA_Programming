import java.util.*;

class Score {
    private int id;
    private int kor;
    private int eng;
    private int math;
    
    public Score(int id, int kor, int eng, int math) {
        this.id = id;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    
    public int getId() {
        return id;
    }
    
    public int getKor() {
        return kor;
    }
    
    public int getEng() {
        return eng;
    }
    
    public int getMath() {
        return math;
    }
    
    public int getAverage() {
        double average = (kor + eng + math) / 3.0;
        return (int) average;
    }
}

public class HashMapStudentEx {
    public static void main(String[] args) {
        // (학생 이름, Score 객체)를 저장하는 해시맵 생성
        LinkedHashMap<String, Score> map = new LinkedHashMap<String, Score>();
        
        // 학생 데이터 추가
        map.put("Hong Gil-dong", new Score(4, 95, 95, 100));
        map.put("Lee Jae-moon", new Score(2, 80, 90, 85));
        map.put("Kim Nam-yoon", new Score(3, 100, 95, 90));
        map.put("Hwang Ki-tae", new Score(1, 90, 100, 80));
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Name to search?: ");
            String input = scanner.nextLine(); // 사용자로부터 이름 또는 개인평균 입력
            
            if (input.equals("exit"))
                break; // while 문을 벗어나 프로그램 종료

            if (input.equals("Individual average")) {
                System.out.println("--------------------------------");
                System.out.println("student personal average score");
                System.out.println("--------------------------------");
                for (Map.Entry<String, Score> entry : map.entrySet()) {
                    String name = entry.getKey();
                    Score score = entry.getValue();
                    System.out.println(name + ": " + score.getAverage());
                }
                System.out.println("--------------------------------");
                break; // 프로그램 종료
            } else {
                if (map.containsKey(input)) {
                    Score score = map.get(input); // 이름에 해당하는 Score 객체 검색
                    System.out.println("Kor: " + score.getKor() + ", Eng: " + score.getEng() + ", Math: " + score.getMath());
                } else {
                    System.out.println(input + " is a person who doesn't exist.");
                }
            }
        }
        
        scanner.close();
    }
}