public class UpdateClass_1_5_3_to_1_5_4 implements rubah.ConversionClass {

    public boolean convert(v0.voldemort.server.VoldemortConfig o0,
                           v1.voldemort.server.VoldemortConfig o1) {
        // New fields
        o1.bdbMaxDelta = 100;
        o1.bdbBinDelta = 75;

        // Fields with type changed

        return true;
    }

}
