import com.google.common.collect.Collections2;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


public class PermutationsWithLibraries {
    public static void main(String[] args) {
        String str = "abcde";
        final List<Character> characters = PermutationsWithLibraries.toCharacterList(str);

        List<String> ls = Collections2.permutations(characters).stream()
                .map(PermutationsWithLibraries::toString)
                .toList();

        for(String permut : ls) {
            System.out.println(permut);
        }
    }

    static List<Character> toCharacterList(final String str) {
        return str
                .chars()
                .mapToObj(s -> ((char) s))
                .collect(Collectors.toList());
    }

    static String toString(Collection<Character> collection) {
        return collection
                .stream()
                .map(s -> s.toString())
                .collect(Collectors.joining());
    }
}

