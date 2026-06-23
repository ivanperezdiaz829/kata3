package software.ulpgc.kata2.serializers;

import software.ulpgc.kata2.model.Movie;

public interface MovieParser {
    Movie from(String str);
}
