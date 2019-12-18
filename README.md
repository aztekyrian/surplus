select backupset.database_name,
backupset.type,
mediafamily.mirror,
backupset.last_recovery_fork_guid,
backupset.backup_set_id,
backupset.backup_set_uuid,
backupset.position,
backupset.first_lsn,
backupset.last_lsn,
backupset.database_backup_lsn,
backupset.name,
backupset.has_bulk_logged_data,
backupset.is_damaged,
backupset.begins_log_chain,
backupset.is_copy_only,
backupset.backup_start_date,
backupset.backup_finish_date,
backupset.database_version,
backupset.database_guid,
mediafamily.logical_device_name,
mediafamily.physical_device_name,
device_type
from msdb.dbo.backupmediafamily mediafamily join msdb.dbo.backupset backupset
on mediafamily.media_set_id = backupset.media_set_id
where backupset.database_name = 'macaroon' and first_lsn=31226000013080400001
order by backupset.backup_finish_date desc;
