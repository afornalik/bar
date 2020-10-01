package pl.afornalik.bar.deserialization;

import com.google.protobuf.InvalidProtocolBufferException;
import pl.afornalik.bar.model.Menu;

public class AvailableMealsDeserialization implements Deserialization<Menu> {

    @Override
    public Menu deserialize(byte[] bytes) {
        try {
            return Menu.parseFrom(bytes);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
        return null;
    }

}
