package lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by olexandra on 1/20/16.
 */
public class Developer {
    private final String name;
    List<String> languages = new ArrayList<>();

    public Developer(String name) {
        this.name = name;
    }

    public void add(String language) {
        languages.add(language);
    }

    public List<String> getLanguages() {
        return languages;
    }
}
