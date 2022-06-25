import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] info = reader.readLine().split(" "); // 트럭 수, 다리 길이, 다리의 최대 하중
        String[] stringTruck = reader.readLine().split(" "); // 문자열로 들어온 트럭

        int w = Integer.parseInt(info[1]); // 다리길이
        int L = Integer.parseInt(info[2]); // 다리의 최대 하중

        Queue<Integer> trucks = new LinkedList<>(); // 트럭
        for (String t : stringTruck) {
            trucks.add(Integer.parseInt(t));
        }

        Queue<Integer> bridge = new LinkedList<>(); // 다리
        for (int x = 0; x < w; x++) {
            bridge.add(0); // 다리만들기
        }
        int trucksW = 0; // 다리위에 있는 트럭의 무게

        int time = 0; // 걸린 시간
        while (bridge.size() > 0) { // 건너가지 못한 트럭이 있는동안 계속 진행
            trucksW -= bridge.poll(); // 다리에서 벗어난 트럭 뺴기
            if (trucks.size() > 0) { // 뒤에 올라올 트럭이 있는 경우
                if (trucks.peek() + trucksW <= L){ // 다리가 버틸 수 있다면 트럭 올리기
                    trucksW += trucks.peek();
                    bridge.add(trucks.poll());
                } else { // 다리가 못버티면 트럭 올리지말기
                    bridge.add(0);
                }
            }
            time++;
        }


        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(Integer.toString(time));
        writer.flush();
        writer.close();
    }
}
