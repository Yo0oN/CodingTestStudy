import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer ND = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(ND.nextToken()); // 지름길 개수
        int D = Integer.parseInt(ND.nextToken()); // 고속도로 길이

        List<Shortcut> shortcuts = new ArrayList<>();
        int[] highway = new int[D + 1];
        Arrays.fill(highway, D + 1); // 다익스트라를 이용해 최솟값을 찾기 위해 모든 노드를 최댓값으로 초기화
        highway[0] = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer line = new StringTokenizer(bufferedReader.readLine());

            int start = Integer.parseInt(line.nextToken());
            int end = Integer.parseInt(line.nextToken());
            int distance = Integer.parseInt(line.nextToken());
            // 그냥 가는것보다 길거나 목적지를 벗어나면 지름길에 넣지 않음
            if (start > D || end > D || distance >= end - start) {
                continue;
            }
            shortcuts.add(new Shortcut(start, end, distance));
        }
        Collections.sort(shortcuts, new Comparator<Shortcut>() {
            @Override
            public int compare(Shortcut o1, Shortcut o2) {
                if (o1.start == o2.start) {
                    return o1.end - o2.end;
                }
                return o1.start - o2.start;
            }
        });

        int shortcutIndex = 0; // 지름길의 인덱스
        int now = 0; // 현재 위치
        while (now < D) {
            if (shortcutIndex < shortcuts.size() && now == shortcuts.get(shortcutIndex).start) {
                Shortcut shortcut = shortcuts.get(shortcutIndex);
                // 현재 위치가 지름길의 시작점이면
                // 지름길을 이용하는것과 기존에 구해진 것을 이용해 가는 것 중 어떤 것이 빠른지 확인
                highway[shortcut.end] = Math.min(highway[now] + shortcut.distance, highway[shortcut.end]);
                shortcutIndex++;
            } else { // 만약 현재 위치가 지름길의 시작점이 아니라면 그냥 1씩 증가시키며 진행
                highway[now  + 1] = Math.min(highway[now + 1], highway[now] + 1);
                now++;
            }
        }

        bufferedWriter.write(String.valueOf(highway[D]));
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    static class Shortcut {
        int start;
        int end;
        int distance;

        public Shortcut(int start, int end, int cost) {
            this.start = start;
            this.end = end;
            this.distance = cost;
        }
    }
}
