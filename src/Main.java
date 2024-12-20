import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> novosNumeros = numeros.stream()
                .filter(n -> n % 2 == 1)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        novosNumeros.forEach(System.out::println);
    }
}