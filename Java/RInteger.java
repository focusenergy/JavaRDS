import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class RInteger extends RThing<Integer> {
    public RInteger(List<Integer> d) { this(d, null); }
    public RInteger(Integer[] d) { this(Arrays.asList(d), null); }
    public RInteger(List<Integer> d, RPairlist attrs) { super(d, attrs); type = 0xd; }

    @Override public void putData(DataOutputStream os) throws IOException {
        os.writeInt(data.size());
        for (Integer i : data)
            os.writeInt(i);
    }
}
