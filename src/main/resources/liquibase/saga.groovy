package liquibase


databaseChangeLog(logicalFilePath: 'saga.groovy') {

    changeSet(id: '2018-11-27-create-table-saga', author: 'shinan.chen') {
        createTable(tableName: 'saga') {
            column(name: 'id', type: 'BIGINT UNSIGNED', autoIncrement: 'true', remarks: 'ID,主键') {
                constraints(primaryKey: 'true')
            }
            column(name: 'code', type: 'VARCHAR(30)', remarks: 'saga识别符号') {
                constraints(nullable: 'false')
            }
            column(name: 'description', type: 'VARCHAR(255)', remarks: '描述')

            column(name: "object_version_number", type: "BIGINT UNSIGNED", defaultValue: "1")
            column(name: "created_by", type: "BIGINT UNSIGNED", defaultValue: "0")
            column(name: "creation_date", type: "DATETIME", defaultValueComputed: "CURRENT_TIMESTAMP")
            column(name: "last_updated_by", type: "BIGINT UNSIGNED", defaultValue: "0")
            column(name: "last_update_date", type: "DATETIME", defaultValueComputed: "CURRENT_TIMESTAMP")
        }
        createIndex(tableName: "saga", indexName: "saga_n1") {
            column(name: "code", type: "VARCHAR(30)")
        }
    }
}