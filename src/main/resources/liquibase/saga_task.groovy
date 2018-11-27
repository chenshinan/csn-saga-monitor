package liquibase


databaseChangeLog(logicalFilePath: 'saga_task.groovy') {

    changeSet(id: '2018-11-27-create-table-saga-task', author: 'shinan.chen') {
        createTable(tableName: 'saga_task') {
            column(name: 'id', type: 'BIGINT UNSIGNED', autoIncrement: 'true', remarks: 'ID,主键') {
                constraints(primaryKey: 'true')
            }
            column(name: 'code', type: 'VARCHAR(30)', remarks: 'saga识别符号') {
                constraints(nullable: 'false')
            }
            column(name: 'saga_code', type: 'VARCHAR(30)', remarks: 'saga任务识别符号') {
                constraints(nullable: 'false')
            }
            column(name: 'seq', type: 'int', remarks: 'saga中任务次序') {
                constraints(nullable: false)
            }
            column(name: 'description', type: 'VARCHAR(255)', remarks: '描述')

            column(name: "object_version_number", type: "BIGINT UNSIGNED", defaultValue: "1")
            column(name: "created_by", type: "BIGINT UNSIGNED", defaultValue: "0")
            column(name: "creation_date", type: "DATETIME", defaultValueComputed: "CURRENT_TIMESTAMP")
            column(name: "last_updated_by", type: "BIGINT UNSIGNED", defaultValue: "0")
            column(name: "last_update_date", type: "DATETIME", defaultValueComputed: "CURRENT_TIMESTAMP")
        }
        createIndex(tableName: "saga_task", indexName: "saga_task_n1") {
            column(name: "code", type: "VARCHAR(30)")
        }
        createIndex(tableName: "saga_task", indexName: "saga_task_n2") {
            column(name: "saga_code", type: "VARCHAR(30)")
        }
    }
}