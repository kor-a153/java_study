package jsonTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.json.JSONArray;
//"/news", "/game", "/brand", "/rank"
//위 4개 경로를 모두 ArrayList에 추가하고,
//경로 앞에 "/app"을 붙인 뒤
//JSONArray로 변경하기
public class JsonTask {
    public static void main(String[] args) {

        ArrayList<String> routes = new ArrayList<>(
                Arrays.asList("/news", "/game", "/brand", "/rank")
        );
//        ArrayList 를 먼저 만들고, 그 리스트에 원하는 값 대입

        // "/app" 붙이기
        ArrayList<String> appRoutes = routes.stream()
                .map(r -> "/app" + r)
                .collect(Collectors.toCollection(ArrayList::new));

        // JSONArray로 변환
        JSONArray jsonArray = new JSONArray(appRoutes);

        System.out.println(jsonArray.toString());
    }
}