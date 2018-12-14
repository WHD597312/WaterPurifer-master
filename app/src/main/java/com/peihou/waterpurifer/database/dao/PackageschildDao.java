package com.peihou.waterpurifer.database.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.peihou.waterpurifer.pojo.Packageschild;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "PACKAGESCHILD".
*/
public class PackageschildDao extends AbstractDao<Packageschild, Long> {

    public static final String TABLENAME = "PACKAGESCHILD";

    /**
     * Properties of entity Packageschild.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property PchildId = new Property(0, Long.class, "pchildId", true, "_id");
        public final static Property PchildNum = new Property(1, int.class, "pchildNum", false, "PCHILD_NUM");
        public final static Property PchildName = new Property(2, String.class, "pchildName", false, "PCHILD_NAME");
        public final static Property PchildOldPrice = new Property(3, int.class, "pchildOldPrice", false, "PCHILD_OLD_PRICE");
        public final static Property PchildNewPrice = new Property(4, int.class, "pchildNewPrice", false, "PCHILD_NEW_PRICE");
        public final static Property PchildDiscount = new Property(5, int.class, "pchildDiscount", false, "PCHILD_DISCOUNT");
        public final static Property ParentId = new Property(6, long.class, "parentId", false, "PARENT_ID");
    }


    public PackageschildDao(DaoConfig config) {
        super(config);
    }
    
    public PackageschildDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"PACKAGESCHILD\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: pchildId
                "\"PCHILD_NUM\" INTEGER NOT NULL ," + // 1: pchildNum
                "\"PCHILD_NAME\" TEXT," + // 2: pchildName
                "\"PCHILD_OLD_PRICE\" INTEGER NOT NULL ," + // 3: pchildOldPrice
                "\"PCHILD_NEW_PRICE\" INTEGER NOT NULL ," + // 4: pchildNewPrice
                "\"PCHILD_DISCOUNT\" INTEGER NOT NULL ," + // 5: pchildDiscount
                "\"PARENT_ID\" INTEGER NOT NULL );"); // 6: parentId
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"PACKAGESCHILD\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Packageschild entity) {
        stmt.clearBindings();
 
        Long pchildId = entity.getPchildId();
        if (pchildId != null) {
            stmt.bindLong(1, pchildId);
        }
        stmt.bindLong(2, entity.getPchildNum());
 
        String pchildName = entity.getPchildName();
        if (pchildName != null) {
            stmt.bindString(3, pchildName);
        }
        stmt.bindLong(4, entity.getPchildOldPrice());
        stmt.bindLong(5, entity.getPchildNewPrice());
        stmt.bindLong(6, entity.getPchildDiscount());
        stmt.bindLong(7, entity.getParentId());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Packageschild entity) {
        stmt.clearBindings();
 
        Long pchildId = entity.getPchildId();
        if (pchildId != null) {
            stmt.bindLong(1, pchildId);
        }
        stmt.bindLong(2, entity.getPchildNum());
 
        String pchildName = entity.getPchildName();
        if (pchildName != null) {
            stmt.bindString(3, pchildName);
        }
        stmt.bindLong(4, entity.getPchildOldPrice());
        stmt.bindLong(5, entity.getPchildNewPrice());
        stmt.bindLong(6, entity.getPchildDiscount());
        stmt.bindLong(7, entity.getParentId());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Packageschild readEntity(Cursor cursor, int offset) {
        Packageschild entity = new Packageschild( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // pchildId
            cursor.getInt(offset + 1), // pchildNum
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // pchildName
            cursor.getInt(offset + 3), // pchildOldPrice
            cursor.getInt(offset + 4), // pchildNewPrice
            cursor.getInt(offset + 5), // pchildDiscount
            cursor.getLong(offset + 6) // parentId
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Packageschild entity, int offset) {
        entity.setPchildId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setPchildNum(cursor.getInt(offset + 1));
        entity.setPchildName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPchildOldPrice(cursor.getInt(offset + 3));
        entity.setPchildNewPrice(cursor.getInt(offset + 4));
        entity.setPchildDiscount(cursor.getInt(offset + 5));
        entity.setParentId(cursor.getLong(offset + 6));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Packageschild entity, long rowId) {
        entity.setPchildId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Packageschild entity) {
        if(entity != null) {
            return entity.getPchildId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Packageschild entity) {
        return entity.getPchildId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
