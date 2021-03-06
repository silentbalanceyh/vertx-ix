/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.ix.domain.tables.records;


import cn.vertxup.ix.domain.tables.XAttachment;
import cn.vertxup.ix.domain.tables.interfaces.IXAttachment;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XAttachmentRecord extends UpdatableRecordImpl<XAttachmentRecord> implements Record15<String, String, String, String, String, String, String, String, String, String, String, Integer, Boolean, String, String>, IXAttachment {

    private static final long serialVersionUID = -1727082742;

    /**
     * Setter for <code>DB_ORIGIN_X.X_ATTACHMENT.KEY</code>. 「key」- 附件的ID值
     */
    @Override
    public XAttachmentRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.X_ATTACHMENT.KEY</code>. 「key」- 附件的ID值
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.X_ATTACHMENT.STORE_WAY</code>. 「storeWay」- 存储方式，BLOB / FILE / TPL / REMOTE
     */
    @Override
    public XAttachmentRecord setStoreWay(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.X_ATTACHMENT.STORE_WAY</code>. 「storeWay」- 存储方式，BLOB / FILE / TPL / REMOTE
     */
    @Override
    public String getStoreWay() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.X_ATTACHMENT.STATUS</code>. 「status」- 状态，PROGRESS / SUCCESS
     */
    @Override
    public XAttachmentRecord setStatus(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.X_ATTACHMENT.STATUS</code>. 「status」- 状态，PROGRESS / SUCCESS
     */
    @Override
    public String getStatus() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.X_ATTACHMENT.NAME</code>. 「name」- 文件名（带扩展名）
     */
    @Override
    public XAttachmentRecord setName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.X_ATTACHMENT.NAME</code>. 「name」- 文件名（带扩展名）
     */
    @Override
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.X_ATTACHMENT.FILE_NAME</code>. 「fileName」- 原始文件名（不带扩展名）
     */
    @Override
    public XAttachmentRecord setFileName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.X_ATTACHMENT.FILE_NAME</code>. 「fileName」- 原始文件名（不带扩展名）
     */
    @Override
    public String getFileName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.X_ATTACHMENT.FILE_KEY</code>. 「fileKey」- TPL模式中的文件唯一的key（全局唯一）
     */
    @Override
    public XAttachmentRecord setFileKey(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.X_ATTACHMENT.FILE_KEY</code>. 「fileKey」- TPL模式中的文件唯一的key（全局唯一）
     */
    @Override
    public String getFileKey() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.X_ATTACHMENT.FILE_URL</code>. 「fileUrl」- 该文件的下载链接（全局唯一）
     */
    @Override
    public XAttachmentRecord setFileUrl(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.X_ATTACHMENT.FILE_URL</code>. 「fileUrl」- 该文件的下载链接（全局唯一）
     */
    @Override
    public String getFileUrl() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.X_ATTACHMENT.FILE_PATH</code>. 「filePath」- 该文件的存储地址，FILE时使用
     */
    @Override
    public XAttachmentRecord setFilePath(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.X_ATTACHMENT.FILE_PATH</code>. 「filePath」- 该文件的存储地址，FILE时使用
     */
    @Override
    public String getFilePath() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.X_ATTACHMENT.EXTENSION</code>. 「extension」- 文件扩展名
     */
    @Override
    public XAttachmentRecord setExtension(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.X_ATTACHMENT.EXTENSION</code>. 「extension」- 文件扩展名
     */
    @Override
    public String getExtension() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.X_ATTACHMENT.MODULE</code>. 「module」- 业务标识
     */
    @Override
    public XAttachmentRecord setModule(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.X_ATTACHMENT.MODULE</code>. 「module」- 业务标识
     */
    @Override
    public String getModule() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.X_ATTACHMENT.MIME</code>. 「mime」- 该文件的MIME类型
     */
    @Override
    public XAttachmentRecord setMime(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.X_ATTACHMENT.MIME</code>. 「mime」- 该文件的MIME类型
     */
    @Override
    public String getMime() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.X_ATTACHMENT.SIZE</code>. 「size」- 该文件的尺寸
     */
    @Override
    public XAttachmentRecord setSize(Integer value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.X_ATTACHMENT.SIZE</code>. 「size」- 该文件的尺寸
     */
    @Override
    public Integer getSize() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.X_ATTACHMENT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public XAttachmentRecord setActive(Boolean value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.X_ATTACHMENT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.X_ATTACHMENT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public XAttachmentRecord setLanguage(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.X_ATTACHMENT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.X_ATTACHMENT.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public XAttachmentRecord setMetadata(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.X_ATTACHMENT.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(14);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<String, String, String, String, String, String, String, String, String, String, String, Integer, Boolean, String, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<String, String, String, String, String, String, String, String, String, String, String, Integer, Boolean, String, String> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return XAttachment.X_ATTACHMENT.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return XAttachment.X_ATTACHMENT.STORE_WAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return XAttachment.X_ATTACHMENT.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return XAttachment.X_ATTACHMENT.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return XAttachment.X_ATTACHMENT.FILE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return XAttachment.X_ATTACHMENT.FILE_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return XAttachment.X_ATTACHMENT.FILE_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return XAttachment.X_ATTACHMENT.FILE_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return XAttachment.X_ATTACHMENT.EXTENSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return XAttachment.X_ATTACHMENT.MODULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return XAttachment.X_ATTACHMENT.MIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return XAttachment.X_ATTACHMENT.SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field13() {
        return XAttachment.X_ATTACHMENT.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return XAttachment.X_ATTACHMENT.LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return XAttachment.X_ATTACHMENT.METADATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getStoreWay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getFileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getFileKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getFileUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getFilePath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getExtension();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getModule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getMime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component13() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getStoreWay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getFileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getFileKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getFileUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getFilePath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getExtension();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getModule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getMime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value13() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XAttachmentRecord value1(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XAttachmentRecord value2(String value) {
        setStoreWay(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XAttachmentRecord value3(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XAttachmentRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XAttachmentRecord value5(String value) {
        setFileName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XAttachmentRecord value6(String value) {
        setFileKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XAttachmentRecord value7(String value) {
        setFileUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XAttachmentRecord value8(String value) {
        setFilePath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XAttachmentRecord value9(String value) {
        setExtension(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XAttachmentRecord value10(String value) {
        setModule(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XAttachmentRecord value11(String value) {
        setMime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XAttachmentRecord value12(Integer value) {
        setSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XAttachmentRecord value13(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XAttachmentRecord value14(String value) {
        setLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XAttachmentRecord value15(String value) {
        setMetadata(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XAttachmentRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, Integer value12, Boolean value13, String value14, String value15) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IXAttachment from) {
        setKey(from.getKey());
        setStoreWay(from.getStoreWay());
        setStatus(from.getStatus());
        setName(from.getName());
        setFileName(from.getFileName());
        setFileKey(from.getFileKey());
        setFileUrl(from.getFileUrl());
        setFilePath(from.getFilePath());
        setExtension(from.getExtension());
        setModule(from.getModule());
        setMime(from.getMime());
        setSize(from.getSize());
        setActive(from.getActive());
        setLanguage(from.getLanguage());
        setMetadata(from.getMetadata());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IXAttachment> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached XAttachmentRecord
     */
    public XAttachmentRecord() {
        super(XAttachment.X_ATTACHMENT);
    }

    /**
     * Create a detached, initialised XAttachmentRecord
     */
    public XAttachmentRecord(String key, String storeWay, String status, String name, String fileName, String fileKey, String fileUrl, String filePath, String extension, String module, String mime, Integer size, Boolean active, String language, String metadata) {
        super(XAttachment.X_ATTACHMENT);

        set(0, key);
        set(1, storeWay);
        set(2, status);
        set(3, name);
        set(4, fileName);
        set(5, fileKey);
        set(6, fileUrl);
        set(7, filePath);
        set(8, extension);
        set(9, module);
        set(10, mime);
        set(11, size);
        set(12, active);
        set(13, language);
        set(14, metadata);
    }
}
