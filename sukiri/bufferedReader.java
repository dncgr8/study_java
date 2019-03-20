
import java.io.*;
import java.io.BufferedReader;

class bufferedReader {
    public static void main(String[] args) {
        File file = new File("/Users/jaelinlee/file/articles.txt");
        try{
            if(checkBeforeFile(file)){
                //FileReader를 인자로 하는 BufferedReader 객체 생성

                BufferedReader br = new BufferedReader(new FileReader(file));

                //파일을 한 문장씩 읽어온다.
                String str = br.readLine();

                //EOF는 null문자를 포함하고 있다.
                while(str != null){
                    //읽은 문자열을 출력한다.
                    System.out.println(str);
                    //다음 문자열을 가르켜준다.
                    str = br.readLine();
                }
                //FileReader와는 다르게 사용 후 꼭 닫아주어야 한다.
                br.close();
            }else{
                System.out.println("파일에 접근할 수 없습니다.");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static boolean checkBeforeFile(File file){
        if(file.exists()){
            if(file.isFile() && file.canRead()){
                return true;
            }
        }
        return false;
    }

}
