package pl.afornalik.bar.deserialization;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Message;
import pl.afornalik.bar.model.Menu;

import java.io.IOException;
import java.io.InputStream;

public class AvailableMealsDeserialization implements Deserialization<Menu> {

    private final InputStream inputStream;

    public AvailableMealsDeserialization(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public Menu deserialize() {
        try {
            return Menu.parseFrom(inputStream.readAllBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
