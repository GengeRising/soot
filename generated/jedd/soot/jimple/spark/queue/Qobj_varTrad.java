package soot.jimple.spark.queue;

import soot.util.*;
import soot.jimple.spark.bdddomains.*;
import soot.jimple.spark.*;
import soot.jimple.toolkits.callgraph.*;
import soot.*;
import soot.util.queue.*;
import jedd.*;
import java.util.*;

public class Qobj_varTrad extends Qobj_var {
    private ChunkedQueue q = new ChunkedQueue();
    
    public void add(AllocNode _obj, VarNode _var) {
        q.add(_obj);
        q.add(_var);
    }
    
    public void add(final jedd.internal.RelationContainer in) {
        Iterator it =
          new jedd.internal.RelationContainer(new Attribute[] { var.v(), obj.v() },
                                              new PhysicalDomain[] { V1.v(), H1.v() },
                                              ("in.iterator(new jedd.Attribute[...]) at /home/olhotak/soot-2" +
                                               "-jedd/src/soot/jimple/spark/queue/Qobj_varTrad.jedd:37,22-24"),
                                              in).iterator(new Attribute[] { obj.v(), var.v() });
        while (it.hasNext()) {
            Object[] tuple = (Object[]) it.next();
            for (int i = 0; i < 2; i++) { add((AllocNode) tuple[0], (VarNode) tuple[1]); }
        }
    }
    
    public Robj_var reader() { return new Robj_varTrad(q.reader()); }
    
    public Qobj_varTrad() { super(); }
}
