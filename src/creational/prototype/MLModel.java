package creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MLModel implements  ObjectClonable{
    private String name;
    private String description;
    private int trainingSplit;
    private int validationSplit;
    private int alpha;
    private int beta;

    public MLModel clone() {
        MLModel model = new MLModel("LR", "description", 1, 2, 3, 4);

        return model;
    }

}
