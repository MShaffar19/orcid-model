//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.09 at 01:52:56 PM BST 
//

package org.orcid.jaxb.model.message;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for scope-path-type.
 * 
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;simpleType name="scope-path-type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="/authorize"/&gt;
 *     &lt;enumeration value="/authenticate"/&gt;
 *     &lt;enumeration value="/read-public"/&gt;
 *     &lt;enumeration value="/webhook"/&gt;
 *     &lt;enumeration value="/orcid-bio/read-limited"/&gt;
 *     &lt;enumeration value="/orcid-profile/read-limited"/&gt;
 *     &lt;enumeration value="/orcid-works/read-limited"/&gt;
 *     &lt;enumeration value="/funding/read-limited"/&gt;
 *     &lt;enumeration value="/orcid-patents/read-limited"/&gt;
 *     &lt;enumeration value="/orcid-works/update"/&gt;
 *     &lt;enumeration value="/funding/update"/&gt;
 *     &lt;enumeration value="/orcid-patents/update"/&gt;
 *     &lt;enumeration value="/orcid-bio/external-identifiers/create"/&gt;
 *     &lt;enumeration value="/orcid-bio/update"/&gt;
 *     &lt;enumeration value="/orcid-works/create"/&gt;
 *     &lt;enumeration value="/funding/create"/&gt;
 *     &lt;enumeration value="/orcid-patents/create"/&gt;
 *     &lt;enumeration value="/orcid-profile/create"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "scope-path-type")
@XmlEnum
public enum ScopePathType implements Serializable {

    //@formatter:off    
	// Read limited scopes    
    @XmlEnumValue(ScopeConstants.READ_PUBLIC) READ_PUBLIC(ScopeConstants.READ_PUBLIC),
    @XmlEnumValue(ScopeConstants.AUTHENTICATE) AUTHENTICATE(ScopeConstants.AUTHENTICATE, READ_PUBLIC),
    
    // Biography
    @XmlEnumValue(ScopeConstants.ORCID_BIO_EXTERNAL_IDENTIFIERS_CREATE) ORCID_BIO_EXTERNAL_IDENTIFIERS_CREATE(ScopeConstants.ORCID_BIO_EXTERNAL_IDENTIFIERS_CREATE, READ_PUBLIC),
    @XmlEnumValue(ScopeConstants.ORCID_BIO_READ_LIMITED) ORCID_BIO_READ_LIMITED(ScopeConstants.ORCID_BIO_READ_LIMITED, READ_PUBLIC),    
    @XmlEnumValue(ScopeConstants.ORCID_BIO_UPDATE) ORCID_BIO_UPDATE(ScopeConstants.ORCID_BIO_UPDATE, ORCID_BIO_EXTERNAL_IDENTIFIERS_CREATE),    
    
    // Affiliations
    @XmlEnumValue(ScopeConstants.AFFILIATIONS_CREATE) AFFILIATIONS_CREATE(ScopeConstants.AFFILIATIONS_CREATE, READ_PUBLIC),
    @XmlEnumValue(ScopeConstants.AFFILIATIONS_READ_LIMITED) AFFILIATIONS_READ_LIMITED(ScopeConstants.AFFILIATIONS_READ_LIMITED, READ_PUBLIC),
    @XmlEnumValue(ScopeConstants.AFFILIATIONS_UPDATE) AFFILIATIONS_UPDATE(ScopeConstants.AFFILIATIONS_UPDATE, READ_PUBLIC),
    
    // Funding
    @XmlEnumValue(ScopeConstants.FUNDING_CREATE) FUNDING_CREATE(ScopeConstants.FUNDING_CREATE, READ_PUBLIC),
    @XmlEnumValue(ScopeConstants.FUNDING_READ_LIMITED) FUNDING_READ_LIMITED(ScopeConstants.FUNDING_READ_LIMITED, READ_PUBLIC),
    @XmlEnumValue(ScopeConstants.FUNDING_UPDATE) FUNDING_UPDATE(ScopeConstants.FUNDING_UPDATE, READ_PUBLIC),
    
    // Patents
    @XmlEnumValue(ScopeConstants.ORCID_PATENTS_CREATE) ORCID_PATENTS_CREATE(ScopeConstants.ORCID_PATENTS_CREATE, READ_PUBLIC),
    @XmlEnumValue(ScopeConstants.ORCID_PATENTS_READ_LIMITED) ORCID_PATENTS_READ_LIMITED(ScopeConstants.ORCID_PATENTS_READ_LIMITED, READ_PUBLIC),
    @XmlEnumValue(ScopeConstants.ORCID_PATENTS_UPDATE) ORCID_PATENTS_UPDATE(ScopeConstants.ORCID_PATENTS_UPDATE, READ_PUBLIC),
    
    // Peer reviews
    @XmlEnumValue(ScopeConstants.PEER_REVIEW_CREATE) PEER_REVIEW_CREATE(ScopeConstants.PEER_REVIEW_CREATE, READ_PUBLIC),
    @XmlEnumValue(ScopeConstants.PEER_REVIEW_READ_LIMITED) PEER_REVIEW_READ_LIMITED(ScopeConstants.PEER_REVIEW_READ_LIMITED, READ_PUBLIC),
    @XmlEnumValue(ScopeConstants.PEER_REVIEW_UPDATE) PEER_REVIEW_UPDATE(ScopeConstants.PEER_REVIEW_UPDATE, READ_PUBLIC),
    
    // Works
    @XmlEnumValue(ScopeConstants.ORCID_WORKS_CREATE) ORCID_WORKS_CREATE(ScopeConstants.ORCID_WORKS_CREATE, READ_PUBLIC),
    @XmlEnumValue(ScopeConstants.ORCID_WORKS_READ_LIMITED) ORCID_WORKS_READ_LIMITED(ScopeConstants.ORCID_WORKS_READ_LIMITED, READ_PUBLIC),
    @XmlEnumValue(ScopeConstants.ORCID_WORKS_UPDATE) ORCID_WORKS_UPDATE(ScopeConstants.ORCID_WORKS_UPDATE, READ_PUBLIC),
    
    // Person
    @XmlEnumValue(ScopeConstants.PERSON_READ_LIMITED) PERSON_READ_LIMITED(ScopeConstants.PERSON_READ_LIMITED, ORCID_BIO_READ_LIMITED),
    @XmlEnumValue(ScopeConstants.PERSON_UPDATE) PERSON_UPDATE(ScopeConstants.PERSON_UPDATE, ORCID_BIO_UPDATE),
    
    // Activities
    @XmlEnumValue(ScopeConstants.ACTIVITIES_READ_LIMITED) ACTIVITIES_READ_LIMITED (ScopeConstants.ACTIVITIES_READ_LIMITED, ORCID_WORKS_READ_LIMITED, AFFILIATIONS_READ_LIMITED, 
            FUNDING_READ_LIMITED, PEER_REVIEW_READ_LIMITED, ORCID_PATENTS_READ_LIMITED),
    @XmlEnumValue(ScopeConstants.ACTIVITIES_UPDATE) ACTIVITIES_UPDATE (ScopeConstants.ACTIVITIES_UPDATE, ORCID_WORKS_CREATE, ORCID_WORKS_UPDATE, AFFILIATIONS_CREATE, AFFILIATIONS_UPDATE, 
    		FUNDING_CREATE, FUNDING_UPDATE, PEER_REVIEW_CREATE, PEER_REVIEW_UPDATE, ORCID_PATENTS_CREATE, ORCID_PATENTS_UPDATE),
    
    // Read limited
    @XmlEnumValue(ScopeConstants.READ_LIMITED) READ_LIMITED(ScopeConstants.READ_LIMITED, ACTIVITIES_READ_LIMITED, PERSON_READ_LIMITED),
    @XmlEnumValue(ScopeConstants.ORCID_PROFILE_READ_LIMITED) ORCID_PROFILE_READ_LIMITED(ScopeConstants.ORCID_PROFILE_READ_LIMITED, READ_LIMITED),
    
    // Emails
    @XmlEnumValue(ScopeConstants.EMAIL_READ_PRIVATE) EMAIL_READ_PRIVATE(ScopeConstants.EMAIL_READ_PRIVATE, READ_PUBLIC),
    
    // Webhooks scopes     
    @XmlEnumValue(ScopeConstants.WEBHOOK) WEBHOOK(ScopeConstants.WEBHOOK),
    
    // Group Id scopes
    @XmlEnumValue(ScopeConstants.GROUP_ID_RECORD_READ) GROUP_ID_RECORD_READ(ScopeConstants.GROUP_ID_RECORD_READ),
    @XmlEnumValue(ScopeConstants.GROUP_ID_RECORD_UPDATE) GROUP_ID_RECORD_UPDATE(ScopeConstants.GROUP_ID_RECORD_UPDATE, GROUP_ID_RECORD_READ),

    // OpenID connect scopes
    @XmlEnumValue(ScopeConstants.OPENID) OPENID(ScopeConstants.OPENID, AUTHENTICATE, READ_PUBLIC),
    
    // ORCID PROFILE CREATE    
    @XmlEnumValue(ScopeConstants.ORCID_PROFILE_CREATE) ORCID_PROFILE_CREATE(ScopeConstants.ORCID_PROFILE_CREATE, AUTHENTICATE, ACTIVITIES_UPDATE, PERSON_UPDATE, ORCID_PROFILE_READ_LIMITED, PEER_REVIEW_CREATE, PEER_REVIEW_UPDATE,
            PEER_REVIEW_READ_LIMITED, GROUP_ID_RECORD_READ, GROUP_ID_RECORD_UPDATE, OPENID),
    
    // Notifications scopes
    @XmlEnumValue(ScopeConstants.BASIC_NOTIFICATION) BASIC_NOTIFICATION(ScopeConstants.BASIC_NOTIFICATION),
    @XmlEnumValue(ScopeConstants.PREMIUM_NOTIFICATION) PREMIUM_NOTIFICATION(ScopeConstants.PREMIUM_NOTIFICATION, BASIC_NOTIFICATION),
    
    // Internal scopes
    @XmlEnumValue(ScopeConstants.INTERNAL_PERSON_LAST_MODIFIED) INTERNAL_PERSON_LAST_MODIFIED (ScopeConstants.INTERNAL_PERSON_LAST_MODIFIED),     
    
    @XmlEnumValue(ScopeConstants.IDENTIFIER_TYPES_CREATE) IDENTIFIER_TYPES_CREATE(ScopeConstants.IDENTIFIER_TYPES_CREATE);
    
    //@formatter:on

    private final String value;

    Set<ScopePathType> combined;

    static Map<String, ScopePathType> mapByValue = new HashMap<String, ScopePathType>();

    static {
        for (ScopePathType scope : values()) {
            mapByValue.put(scope.value(), scope);
        }
    }

    ScopePathType(String value, ScopePathType... inherited) {
        this.value = value;
        if(this.combined == null) {
            this.combined = new HashSet<ScopePathType>();
        }
        for(ScopePathType scope : inherited) {
            this.combine(scope);
        }
        this.combined.add(this);
    }    
    
    private void combine(ScopePathType scope) {
        Set<ScopePathType> toCombine = scope.combined();
        if(toCombine != null){
            for(ScopePathType other : toCombine) {
                if(!other.equals(scope)) {
                    if(other.combined() != null && !other.combined().isEmpty()) {
                        for(ScopePathType childScope : other.combined()) {
                            combine(childScope);
                        }                    
                    }
                }
            }            
        }        
        this.combined.add(scope);
    }
    
    public String value() {
        return value;
    }

    public String getContent() {
        return value;
    }

    public static ScopePathType fromValue(String scopeString) {
        if (mapByValue.containsKey(scopeString)) {
            return mapByValue.get(scopeString);
        }
        throw new IllegalArgumentException(scopeString);
    }

    /**
     * @return A set containing this scope and all its inherited scopes
     */
    public Set<ScopePathType> combined() {
        return combined;
    }

    /*
     * These types are issued by the user and last a long time
     */
    public boolean isReadOnlyScope() {
        switch (this) {
        case ORCID_BIO_READ_LIMITED:
            return true;
        case ORCID_PROFILE_READ_LIMITED:
            return true;
        case ORCID_WORKS_READ_LIMITED:
            return true;
        case FUNDING_READ_LIMITED:
            return true;
        case AFFILIATIONS_READ_LIMITED:
            return true;
        case PEER_REVIEW_READ_LIMITED:
            return true;
        case ORCID_PATENTS_READ_LIMITED:
            return true;
        case ACTIVITIES_READ_LIMITED:
            return true;
        case READ_LIMITED:
            return true;
        case PERSON_READ_LIMITED:
            return true;
        case OPENID:
            return true;
        default:
            return false;
        }
    }

    /*
     * https://members.orcid.org/api/oauth/orcid-scopes These types are
     * issues by ORCID and don't expire for at long time.
     */
    public boolean isClientCreditalScope() {
        switch (this) {
        case ORCID_PROFILE_CREATE:
            return true;
        case READ_PUBLIC:
            return true;
        case WEBHOOK:
            return true;
        case PREMIUM_NOTIFICATION:
            return true;
        case GROUP_ID_RECORD_READ:
            return true;
        case GROUP_ID_RECORD_UPDATE:
            return true;
        default:
            return false;
        }
    }

    /*
     * These scopes are granted by the user and currently only last an hour.
     */
    public boolean isUserGrantWriteScope() {
        switch (this) {
        case AFFILIATIONS_UPDATE:
            return true;
        case AFFILIATIONS_CREATE:
            return true;
        case ORCID_WORKS_UPDATE:
            return true;
        case ORCID_WORKS_CREATE:
            return true;
        case ORCID_BIO_EXTERNAL_IDENTIFIERS_CREATE:
            return true;
        case ORCID_BIO_UPDATE:
            return true;
        case ORCID_PROFILE_CREATE:
            // this is tricky, this scope doesn't follow all the rules of
            // of the other scopes, it is allow to have a longer expiration date
            // and only works on unclaimed records
            return false;
        case FUNDING_CREATE:
            return true;
        case FUNDING_UPDATE:
            return true;
        case ORCID_PATENTS_CREATE:
            return true;
        case ORCID_PATENTS_UPDATE:
            return true;
        case ACTIVITIES_UPDATE:
            return true;
        case PERSON_UPDATE:
            return true;
        default:
            return false;
        }
    }

    public boolean isInternalScope() {
        switch (this) {
        case INTERNAL_PERSON_LAST_MODIFIED:
            return true;
        default:
            return false;
        }
    }

    /**
     * @return A set containing the external identifiers for this scope and all
     *         its inherited scopes
     */
    public Set<String> getCombinedAsStrings() {
        return getScopesAsStrings(combined());
    }

    public boolean hasScope(ScopePathType scope) {
        return combined.contains(scope);
    }

    public boolean hasScope(String scope) {
        return hasScope(fromValue(scope));
    }

    public static boolean hasStringScope(String scope, ScopePathType required) {
        return fromValue(scope).combined().contains(required);
    }

    public static Set<ScopePathType> getScopesFromStrings(Collection<String> scopes) {
        Set<ScopePathType> newScopes = new HashSet<ScopePathType>();
        for (String scopeString : scopes) {
            ScopePathType scope = mapByValue.get(scopeString);
            if (scope != null) {
                newScopes.add(scope);
            }
        }
        return newScopes;
    }

    public static Set<String> getCombinedScopesFromStringsAsStrings(Collection<String> scopes) {
        Set<String> newScopes = new HashSet<>();
        for (String scopeString : scopes) {
            ScopePathType scope = mapByValue.get(scopeString);
            if (scope != null) {
                newScopes.addAll(getScopesAsStrings(scope.combined()));
            }
        }
        return newScopes;
    }

    public static Set<ScopePathType> getScopesFromSpaceSeparatedString(String scopesString) {
        if (scopesString == null) {
            return null;
        }
        return getScopesFromStrings(Arrays.asList(scopesString.split("\\s")));
    }

    public static Set<String> getScopesAsStrings(Collection<ScopePathType> scopes) {
        Set<String> scopeStrings = new HashSet<String>();
        for (ScopePathType scope : scopes) {
            scopeStrings.add(scope.value());
        }
        return scopeStrings;
    }

    public static String getScopesAsSingleString(Collection<ScopePathType> scopes) {
        StringBuilder sb = new StringBuilder();

        for (ScopePathType scope : scopes) {
            sb.append(scope.value() + " ");
        }
        return sb.toString().trim();
    }

    public static Set<String> getScopesAsStrings(ScopePathType... scopes) {
        return getScopesAsStrings(Arrays.asList(scopes));
    }               

}