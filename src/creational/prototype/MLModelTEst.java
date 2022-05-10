package creational.prototype;

import org.junit.Assert;
import org.junit.Test;

public class MLModelTEst {

    private ModelREgistry rEgistry  = null;

    @Test
    public void testMLMOdel() {
        MLModel model = new MLModel("LR", "description", 1, 2, 3, 4);

        Assert.assertEquals("LR", model.getName());
    }

    @Test
    public void testMLModel1() {
        MLModel model = new MLModel("LR", "description", 1, 2, 3, 4);
        model.clone();
        Assert.assertEquals("LR", model.getName());
    }

    @Test
    public void testMultiple() {
        MLModel model = new MLModel("LR", "description", 1, 2, 3, 4);
        model.clone();
        for (int i = 0; i < 10; i++) {
            MLModel cloned = model.clone();
            cloned.setAlpha(12);
            cloned.setBeta(14);
        }
    }

    @Test
    public void testRegistry() {
//        MLModel model = rEgistry.getModel(ModelType.DT);

        Assert.assertEquals("", "");
    }
}
