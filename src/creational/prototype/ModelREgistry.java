package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ModelREgistry {
    public static Map<ModelType, MLModel> map = new HashMap<>();
    public void registerModel(MLModel model) {
        map.put(ModelType.DT, model);
    }

    public void getModel(ModelType modelType) {
//        map.put(ModelType.DT, );
    }
}
