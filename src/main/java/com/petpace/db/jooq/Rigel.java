/**
 * This class is generated by jOOQ
 */
package com.petpace.db.jooq;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Rigel extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 710144966;

	/**
	 * The singleton instance of <code>rigel</code>
	 */
	public static final Rigel RIGEL = new Rigel();

	/**
	 * No further instances allowed
	 */
	private Rigel() {
		super("rigel");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			com.petpace.db.jooq.tables.Accounts.ACCOUNTS,
			com.petpace.db.jooq.tables.Address.ADDRESS,
			com.petpace.db.jooq.tables.Alerts.ALERTS,
			com.petpace.db.jooq.tables.AlertNotifications.ALERT_NOTIFICATIONS,
			com.petpace.db.jooq.tables.AlertNotificationBusinessUnits.ALERT_NOTIFICATION_BUSINESS_UNITS,
			com.petpace.db.jooq.tables.AlertNotificationPreferences.ALERT_NOTIFICATION_PREFERENCES,
			com.petpace.db.jooq.tables.AlertNotificationPreferenceOwners.ALERT_NOTIFICATION_PREFERENCE_OWNERS,
			com.petpace.db.jooq.tables.AlertNotificationPreferencePets.ALERT_NOTIFICATION_PREFERENCE_PETS,
			com.petpace.db.jooq.tables.AlertNotificationReceivers.ALERT_NOTIFICATION_RECEIVERS,
			com.petpace.db.jooq.tables.AlertRules.ALERT_RULES,
			com.petpace.db.jooq.tables.Breeds.BREEDS,
			com.petpace.db.jooq.tables.BreedAttributes.BREED_ATTRIBUTES,
			com.petpace.db.jooq.tables.BreedAttributeGrouping.BREED_ATTRIBUTE_GROUPING,
			com.petpace.db.jooq.tables.BreedAttributeGroups.BREED_ATTRIBUTE_GROUPS,
			com.petpace.db.jooq.tables.BreedAttributeValuesVarchar.BREED_ATTRIBUTE_VALUES_VARCHAR,
			com.petpace.db.jooq.tables.Businesses.BUSINESSES,
			com.petpace.db.jooq.tables.BusinessAdministrators.BUSINESS_ADMINISTRATORS,
			com.petpace.db.jooq.tables.BusinessUnits.BUSINESS_UNITS,
			com.petpace.db.jooq.tables.BusinessUnitAdministrators.BUSINESS_UNIT_ADMINISTRATORS,
			com.petpace.db.jooq.tables.BusinessUnitCollars.BUSINESS_UNIT_COLLARS,
			com.petpace.db.jooq.tables.BusinessUnitPets.BUSINESS_UNIT_PETS,
			com.petpace.db.jooq.tables.BusinessUnitVeterinarians.BUSINESS_UNIT_VETERINARIANS,
			com.petpace.db.jooq.tables.Collars.COLLARS,
			com.petpace.db.jooq.tables.CollarConfigs.COLLAR_CONFIGS,
			com.petpace.db.jooq.tables.CollarFirmwares.COLLAR_FIRMWARES,
			com.petpace.db.jooq.tables.CollarGroups.COLLAR_GROUPS,
			com.petpace.db.jooq.tables.CollarRegistrations.COLLAR_REGISTRATIONS,
			com.petpace.db.jooq.tables.Gateways.GATEWAYS,
			com.petpace.db.jooq.tables.GatewayCollarConnections.GATEWAY_COLLAR_CONNECTIONS,
			com.petpace.db.jooq.tables.GatewayConfigs.GATEWAY_CONFIGS,
			com.petpace.db.jooq.tables.GatewayFirmwares.GATEWAY_FIRMWARES,
			com.petpace.db.jooq.tables.GatewayGroups.GATEWAY_GROUPS,
			com.petpace.db.jooq.tables.GatewayLogs.GATEWAY_LOGS,
			com.petpace.db.jooq.tables.GatewayServers.GATEWAY_SERVERS,
			com.petpace.db.jooq.tables.GatewayServerConnections.GATEWAY_SERVER_CONNECTIONS,
			com.petpace.db.jooq.tables.Owners.OWNERS,
			com.petpace.db.jooq.tables.Pets.PETS,
			com.petpace.db.jooq.tables.PetAttributes.PET_ATTRIBUTES,
			com.petpace.db.jooq.tables.PetAttributeGrouping.PET_ATTRIBUTE_GROUPING,
			com.petpace.db.jooq.tables.PetAttributeGroups.PET_ATTRIBUTE_GROUPS,
			com.petpace.db.jooq.tables.PetAttributeValues.PET_ATTRIBUTE_VALUES,
			com.petpace.db.jooq.tables.PetAttributeValueHistory.PET_ATTRIBUTE_VALUE_HISTORY,
			com.petpace.db.jooq.tables.PetEntities.PET_ENTITIES,
			com.petpace.db.jooq.tables.PetGuardianship.PET_GUARDIANSHIP,
			com.petpace.db.jooq.tables.PetOwnerCollars.PET_OWNER_COLLARS,
			com.petpace.db.jooq.tables.PetPrimaryVeterinarians.PET_PRIMARY_VETERINARIANS,
			com.petpace.db.jooq.tables.PlaceCities.PLACE_CITIES,
			com.petpace.db.jooq.tables.PlaceCountries.PLACE_COUNTRIES,
			com.petpace.db.jooq.tables.PlaceNeighborhoods.PLACE_NEIGHBORHOODS,
			com.petpace.db.jooq.tables.PlaceProvinces.PLACE_PROVINCES,
			com.petpace.db.jooq.tables.PostalCodes.POSTAL_CODES,
			com.petpace.db.jooq.tables.PrimaryVeterinarians.PRIMARY_VETERINARIANS,
			com.petpace.db.jooq.tables.RemoteLogins.REMOTE_LOGINS,
			com.petpace.db.jooq.tables.Roles.ROLES,
			com.petpace.db.jooq.tables.Veterinarians.VETERINARIANS,
			com.petpace.db.jooq.tables.Vitals.VITALS,
			com.petpace.db.jooq.tables.VitalActivity.VITAL_ACTIVITY,
			com.petpace.db.jooq.tables.VitalActivityHour.VITAL_ACTIVITY_HOUR,
			com.petpace.db.jooq.tables.VitalActivityMinute.VITAL_ACTIVITY_MINUTE,
			com.petpace.db.jooq.tables.VitalAmbienttemp.VITAL_AMBIENTTEMP,
			com.petpace.db.jooq.tables.VitalBodytemp.VITAL_BODYTEMP,
			com.petpace.db.jooq.tables.VitalBodytempHour.VITAL_BODYTEMP_HOUR,
			com.petpace.db.jooq.tables.VitalBodytempMinute.VITAL_BODYTEMP_MINUTE,
			com.petpace.db.jooq.tables.VitalCollarCalibrations.VITAL_COLLAR_CALIBRATIONS,
			com.petpace.db.jooq.tables.VitalPetAttributes.VITAL_PET_ATTRIBUTES,
			com.petpace.db.jooq.tables.VitalPosition.VITAL_POSITION,
			com.petpace.db.jooq.tables.VitalPulse.VITAL_PULSE,
			com.petpace.db.jooq.tables.VitalPulseHour.VITAL_PULSE_HOUR,
			com.petpace.db.jooq.tables.VitalPulseMinute.VITAL_PULSE_MINUTE,
			com.petpace.db.jooq.tables.VitalRespiratory.VITAL_RESPIRATORY,
			com.petpace.db.jooq.tables.VitalRespiratoryHour.VITAL_RESPIRATORY_HOUR,
			com.petpace.db.jooq.tables.VitalRespiratoryMinute.VITAL_RESPIRATORY_MINUTE,
			com.petpace.db.jooq.tables.VitalStatus.VITAL_STATUS);
	}
}