/*
 * This file is generated by jOOQ.
*/
package com.uet.fingerpinter.db;


import com.uet.fingerpinter.db.tables.Building;
import com.uet.fingerpinter.db.tables.FingerprinterInfo;
import com.uet.fingerpinter.db.tables.Room;
import com.uet.fingerpinter.db.tables.records.BuildingRecord;
import com.uet.fingerpinter.db.tables.records.FingerprinterInfoRecord;
import com.uet.fingerpinter.db.tables.records.RoomRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>location_indoor</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<BuildingRecord, Integer> IDENTITY_BUILDING = Identities0.IDENTITY_BUILDING;
    public static final Identity<FingerprinterInfoRecord, Integer> IDENTITY_FINGERPRINTER_INFO = Identities0.IDENTITY_FINGERPRINTER_INFO;
    public static final Identity<RoomRecord, Integer> IDENTITY_ROOM = Identities0.IDENTITY_ROOM;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<BuildingRecord> KEY_BUILDING_PRIMARY = UniqueKeys0.KEY_BUILDING_PRIMARY;
    public static final UniqueKey<FingerprinterInfoRecord> KEY_FINGERPRINTER_INFO_PRIMARY = UniqueKeys0.KEY_FINGERPRINTER_INFO_PRIMARY;
    public static final UniqueKey<RoomRecord> KEY_ROOM_PRIMARY = UniqueKeys0.KEY_ROOM_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<FingerprinterInfoRecord, RoomRecord> FK_FINGERPRINGER_INFO_2 = ForeignKeys0.FK_FINGERPRINGER_INFO_2;
    public static final ForeignKey<FingerprinterInfoRecord, BuildingRecord> FK_FINGERPRINGER_INFO_1 = ForeignKeys0.FK_FINGERPRINGER_INFO_1;
    public static final ForeignKey<RoomRecord, BuildingRecord> FK_ROOM_1 = ForeignKeys0.FK_ROOM_1;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<BuildingRecord, Integer> IDENTITY_BUILDING = createIdentity(Building.BUILDING, Building.BUILDING.ID);
        public static Identity<FingerprinterInfoRecord, Integer> IDENTITY_FINGERPRINTER_INFO = createIdentity(FingerprinterInfo.FINGERPRINTER_INFO, FingerprinterInfo.FINGERPRINTER_INFO.ID);
        public static Identity<RoomRecord, Integer> IDENTITY_ROOM = createIdentity(Room.ROOM, Room.ROOM.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<BuildingRecord> KEY_BUILDING_PRIMARY = createUniqueKey(Building.BUILDING, "KEY_building_PRIMARY", Building.BUILDING.ID);
        public static final UniqueKey<FingerprinterInfoRecord> KEY_FINGERPRINTER_INFO_PRIMARY = createUniqueKey(FingerprinterInfo.FINGERPRINTER_INFO, "KEY_fingerprinter_info_PRIMARY", FingerprinterInfo.FINGERPRINTER_INFO.ID);
        public static final UniqueKey<RoomRecord> KEY_ROOM_PRIMARY = createUniqueKey(Room.ROOM, "KEY_room_PRIMARY", Room.ROOM.ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<FingerprinterInfoRecord, RoomRecord> FK_FINGERPRINGER_INFO_2 = createForeignKey(com.uet.fingerpinter.db.Keys.KEY_ROOM_PRIMARY, FingerprinterInfo.FINGERPRINTER_INFO, "fk_fingerpringer_info_2", FingerprinterInfo.FINGERPRINTER_INFO.ROOM_ID);
        public static final ForeignKey<FingerprinterInfoRecord, BuildingRecord> FK_FINGERPRINGER_INFO_1 = createForeignKey(com.uet.fingerpinter.db.Keys.KEY_BUILDING_PRIMARY, FingerprinterInfo.FINGERPRINTER_INFO, "fk_fingerpringer_info_1", FingerprinterInfo.FINGERPRINTER_INFO.BUILDING_ID);
        public static final ForeignKey<RoomRecord, BuildingRecord> FK_ROOM_1 = createForeignKey(com.uet.fingerpinter.db.Keys.KEY_BUILDING_PRIMARY, Room.ROOM, "fk_room_1", Room.ROOM.BUILDING_ID);
    }
}