package soot.jimple.spark.queue;

import soot.util.*;
import soot.jimple.spark.bdddomains.*;
import soot.jimple.spark.*;
import soot.jimple.toolkits.callgraph.*;
import soot.*;
import soot.util.queue.*;
import jedd.*;
import java.util.*;

public abstract class Rctxt_local_obj_srcm_stmt_kind_tgtm {
    public abstract Iterator iterator();
    
    public abstract jedd.internal.RelationContainer get();
    
    public abstract boolean hasNext();
    
    public static class Tuple {
        private Context _ctxt;
        
        public Context ctxt() { return _ctxt; }
        
        private Local _local;
        
        public Local local() { return _local; }
        
        private AllocNode _obj;
        
        public AllocNode obj() { return _obj; }
        
        private SootMethod _srcm;
        
        public SootMethod srcm() { return _srcm; }
        
        private Unit _stmt;
        
        public Unit stmt() { return _stmt; }
        
        private Kind _kind;
        
        public Kind kind() { return _kind; }
        
        private SootMethod _tgtm;
        
        public SootMethod tgtm() { return _tgtm; }
        
        public Tuple(Context _ctxt,
                     Local _local,
                     AllocNode _obj,
                     SootMethod _srcm,
                     Unit _stmt,
                     Kind _kind,
                     SootMethod _tgtm) {
            super();
            this._ctxt = _ctxt;
            this._local = _local;
            this._obj = _obj;
            this._srcm = _srcm;
            this._stmt = _stmt;
            this._kind = _kind;
            this._tgtm = _tgtm;
        }
        
        public int hashCode() { return 0; }
        
        public boolean equals(Object other) {
            if (!(other instanceof Tuple)) return false;
            Tuple o = (Tuple) other;
            if (o._ctxt != _ctxt) return false;
            if (o._local != _local) return false;
            if (o._obj != _obj) return false;
            if (o._srcm != _srcm) return false;
            if (o._stmt != _stmt) return false;
            if (o._kind != _kind) return false;
            if (o._tgtm != _tgtm) return false;
            return true;
        }
        
        public String toString() {
            StringBuffer ret = new StringBuffer();
            ret.append(ctxt());
            ret.append(", ");
            ret.append(local());
            ret.append(", ");
            ret.append(obj());
            ret.append(", ");
            ret.append(srcm());
            ret.append(", ");
            ret.append(stmt());
            ret.append(", ");
            ret.append(kind());
            ret.append(", ");
            ret.append(tgtm());
            ret.append(", ");
            return ret.toString();
        }
    }
    
    
    public Rctxt_local_obj_srcm_stmt_kind_tgtm() { super(); }
}
