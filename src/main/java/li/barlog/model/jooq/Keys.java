/*
 * This file is generated by jOOQ.
*/
package li.barlog.model.jooq;


import javax.annotation.Generated;

import li.barlog.model.jooq.tables.Person;
import li.barlog.model.jooq.tables.SchemaVersion;
import li.barlog.model.jooq.tables.records.PersonRecord;
import li.barlog.model.jooq.tables.records.SchemaVersionRecord;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<PersonRecord, Long> IDENTITY_PERSON = Identities0.IDENTITY_PERSON;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<PersonRecord> PERSON_PK = UniqueKeys0.PERSON_PK;
    public static final UniqueKey<SchemaVersionRecord> SCHEMA_VERSION_PK = UniqueKeys0.SCHEMA_VERSION_PK;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<PersonRecord, Long> IDENTITY_PERSON = createIdentity(Person.PERSON, Person.PERSON.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<PersonRecord> PERSON_PK = createUniqueKey(Person.PERSON, "person_pk", Person.PERSON.ID);
        public static final UniqueKey<SchemaVersionRecord> SCHEMA_VERSION_PK = createUniqueKey(SchemaVersion.SCHEMA_VERSION, "schema_version_pk", SchemaVersion.SCHEMA_VERSION.INSTALLED_RANK);
    }
}