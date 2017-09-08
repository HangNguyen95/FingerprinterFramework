/*
 * This file is generated by jOOQ.
*/
package com.example.db.tables;


import com.example.db.Keys;
import com.example.db.LocationIndoor;
import com.example.db.tables.records.FingerprinterInfoRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FingerprinterInfo extends TableImpl<FingerprinterInfoRecord> {

    private static final long serialVersionUID = -1345451811;

    /**
     * The reference instance of <code>location_indoor.fingerprinter_info</code>
     */
    public static final FingerprinterInfo FINGERPRINTER_INFO = new FingerprinterInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FingerprinterInfoRecord> getRecordType() {
        return FingerprinterInfoRecord.class;
    }

    /**
     * The column <code>location_indoor.fingerprinter_info.id</code>.
     */
    public final TableField<FingerprinterInfoRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>location_indoor.fingerprinter_info.ap_name</code>.
     */
    public final TableField<FingerprinterInfoRecord, String> AP_NAME = createField("ap_name", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

    /**
     * The column <code>location_indoor.fingerprinter_info.mac_address</code>.
     */
    public final TableField<FingerprinterInfoRecord, String> MAC_ADDRESS = createField("mac_address", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

    /**
     * The column <code>location_indoor.fingerprinter_info.ip_address</code>.
     */
    public final TableField<FingerprinterInfoRecord, String> IP_ADDRESS = createField("ip_address", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

    /**
     * The column <code>location_indoor.fingerprinter_info.rss</code>.
     */
    public final TableField<FingerprinterInfoRecord, Double> RSS = createField("rss", org.jooq.impl.SQLDataType.FLOAT.nullable(false), this, "");

    /**
     * The column <code>location_indoor.fingerprinter_info.x</code>.
     */
    public final TableField<FingerprinterInfoRecord, Double> X = createField("x", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>location_indoor.fingerprinter_info.y</code>.
     */
    public final TableField<FingerprinterInfoRecord, Double> Y = createField("y", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>location_indoor.fingerprinter_info.room_id</code>.
     */
    public final TableField<FingerprinterInfoRecord, Integer> ROOM_ID = createField("room_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>location_indoor.fingerprinter_info</code> table reference
     */
    public FingerprinterInfo() {
        this("fingerprinter_info", null);
    }

    /**
     * Create an aliased <code>location_indoor.fingerprinter_info</code> table reference
     */
    public FingerprinterInfo(String alias) {
        this(alias, FINGERPRINTER_INFO);
    }

    private FingerprinterInfo(String alias, Table<FingerprinterInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private FingerprinterInfo(String alias, Table<FingerprinterInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return LocationIndoor.LOCATION_INDOOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FingerprinterInfoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FINGERPRINTER_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FingerprinterInfoRecord> getPrimaryKey() {
        return Keys.KEY_FINGERPRINTER_INFO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FingerprinterInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<FingerprinterInfoRecord>>asList(Keys.KEY_FINGERPRINTER_INFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FingerprinterInfo as(String alias) {
        return new FingerprinterInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FingerprinterInfo rename(String name) {
        return new FingerprinterInfo(name, null);
    }
}
