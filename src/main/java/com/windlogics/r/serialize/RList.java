package com.windlogics.r.serialize;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;

public class RList extends RThing<RThing> {
    public RList(List<RThing> d) { this(d, null); }
    public RList(List<RThing> d, RPairlist attrs) { super(d, attrs); }

    @Override public void putData(DataOutputStream os) throws IOException {
        os.writeInt(data.size());
        for (RThing d : data) {
            d.serialize(os);
        }
    }

    @Override public int type() {
        return 0x13;
    }
}
