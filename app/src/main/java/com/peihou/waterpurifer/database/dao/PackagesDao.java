package com.peihou.waterpurifer.database.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.peihou.waterpurifer.pojo.Packages;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "PACKAGES".
*/
public class PackagesDao extends AbstractDao<Packages, Long> {

    public static final String TABLENAME = "PACKAGES";

    /**
     * Properties of entity Packages.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property PackageId = new Property(0, Long.class, "packageId", true, "_id");
        public final static Property PackageName = new Property(1, String.class, "packageName", false, "PACKAGE_NAME");
    }


    public PackagesDao(DaoConfig config) {
        super(config);
    }
    
    public PackagesDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"PACKAGES\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: packageId
                "\"PACKAGE_NAME\" TEXT);"); // 1: packageName
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"PACKAGES\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Packages entity) {
        stmt.clearBindings();
 
        Long packageId = entity.getPackageId();
        if (packageId != null) {
            stmt.bindLong(1, packageId);
        }
 
        String packageName = entity.getPackageName();
        if (packageName != null) {
            stmt.bindString(2, packageName);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Packages entity) {
        stmt.clearBindings();
 
        Long packageId = entity.getPackageId();
        if (packageId != null) {
            stmt.bindLong(1, packageId);
        }
 
        String packageName = entity.getPackageName();
        if (packageName != null) {
            stmt.bindString(2, packageName);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Packages readEntity(Cursor cursor, int offset) {
        Packages entity = new Packages( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // packageId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1) // packageName
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Packages entity, int offset) {
        entity.setPackageId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setPackageName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Packages entity, long rowId) {
        entity.setPackageId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Packages entity) {
        if(entity != null) {
            return entity.getPackageId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Packages entity) {
        return entity.getPackageId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}