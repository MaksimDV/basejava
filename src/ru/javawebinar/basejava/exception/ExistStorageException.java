package ru.javawebinar.basejava.exception;

public class ExistStorageException extends StorageException{
    public ExistStorageException(String uuid) {
        super("Resume " + uuid + " already exists in the storage", uuid);
    }
}
