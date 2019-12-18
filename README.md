select 
	backupset.database_name, 
	backupset.type, 
	backupset.first_lsn, 
	backupset.last_lsn, 
	backupset.database_backup_lsn, 
	backupset.name,
	backupset.backup_start_date, 
	backupset.backup_finish_date,
	backupset.database_version, backupset.database_guid,
	mediafamily.logical_device_name, mediafamily.physical_device_name 
 from 
	msdb.dbo.backupmediafamily mediafamily join msdb.dbo.backupset backupset 
 on 
	mediafamily.media_set_id = backupset.media_set_id 
 where 
	backupset.database_name = 'AdventureWorks2008R2' 
