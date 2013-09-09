/**
 * 
 */
package com.vietnamarena.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author NguyenPV
 *
 */
public class PasswordUtils {
	
    private static final Log LOG = LogFactory.getLog(PasswordUtils.class);
    private static final String CHAR_ENCODING = "UTF-8";
    private static final String HASH_FUNCTION = "SHA-256";
    

    /**
     * {@inheritDoc}     
     */
    public static String encodePassword(String password) {

        LOG.debug("BEGIN");
        if (password == null) {
            return null;
        }    

        byte[] unencodedPassword = null;
        try {
            unencodedPassword = password.getBytes(CHAR_ENCODING);
        } catch (UnsupportedEncodingException uee) {
            LOG.error("Encode Password Exception", uee);
            return null;
        }

        MessageDigest md = null;
        try {
            // first create an instance, given the provider
            md = MessageDigest.getInstance(HASH_FUNCTION);
        } catch (NoSuchAlgorithmException e) {
            LOG.error("Encode Password Exception", e);
            return null;
        }

        md.reset();

        // call the update method one or more times
        // (useful when you don't know the size of your data, eg. stream)
        md.update(unencodedPassword);
        // now calculate the hash
        byte[] encodedPassword = md.digest();
        // convert the hash into readable string
        String hash = new String(Base64.encodeBase64(encodedPassword)).toUpperCase();
        LOG.debug("END");

        return hash;

    }

    /**
     * {@inheritDoc}
     */
    public static boolean isPasswordValid(String encryptedPwd, String password) {
        LOG.debug("BEGIN");
        if (StringUtils.isBlank(password) || StringUtils.isBlank(encryptedPwd)) {
            LOG.debug("END");
            return false;
        } else {
            String pwd = encodePassword(password);
            LOG.debug("END");
            return pwd.equals(encryptedPwd);
        }
    }
}
