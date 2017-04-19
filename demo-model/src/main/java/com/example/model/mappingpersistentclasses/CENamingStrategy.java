package com.example.model.mappingpersistentclasses;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

@SuppressWarnings("serial")
public class CENamingStrategy extends org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl {

	/**
	 * Singleton access
	 */
	public static final PhysicalNamingStrategyStandardImpl INSTANCE = new PhysicalNamingStrategyStandardImpl();

	@Override
	public Identifier toPhysicalCatalogName(Identifier name, JdbcEnvironment context) {
		return name;
	}

	@Override
	public Identifier toPhysicalSchemaName(Identifier name, JdbcEnvironment context) {
		return name;
	}

	@Override
	public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment context) {
		//return new Identifier("CE_" + name.getText(), name.isQuoted());
		return new Identifier(name.getText(), name.isQuoted());
	}

	@Override
	public Identifier toPhysicalSequenceName(Identifier name, JdbcEnvironment context) {
		return name;
	}

	@Override
	public Identifier toPhysicalColumnName(Identifier name, JdbcEnvironment context) {
		return name;
	}
}