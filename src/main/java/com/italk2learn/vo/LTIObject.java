package com.italk2learn.vo;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class LTIObject {
	
	private static String lti_message_type="basic-lti-launch-request";
	
	private static String lti_version="basic-lti-launch-request";
	
	/*
	 * Includes the type of content that call the service
	 */
	
	private static ActivityType resource_link_id;
	
	/*
	 * Unique id of the course from which the user is accessing the app. If a app were added multiple times to the same course, 
	 * this id would be the same regardless of which link was used to launch the app.
	 */
    private String context_id;

    /*
     * unique id referencing the user accessing the app. providers should consider this id an opaque identifier
     */
    private String user_id;

    /*
     * there's a long list of possible roles, but here's the most common ones:
	    Learner
	    Instructor
	    ContentDeveloper
	    urn:lti:instrole:ims/lis/Observer
	    urn:lti:instrole:ims/lis/Administrator
     */
    private Collection<GrantedAuthority> roles;


	public LTIObject() {
		super();
	}
	
	
	public static String getLti_message_type() {
		return lti_message_type;
	}


	public static void setLti_message_type(String lti_message_type) {
		LTIObject.lti_message_type = lti_message_type;
	}


	public static String getLti_version() {
		return lti_version;
	}


	public static void setLti_version(String lti_version) {
		LTIObject.lti_version = lti_version;
	}


	public static ActivityType getResource_link_id() {
		return resource_link_id;
	}


	public static void setResource_link_id(ActivityType resource_link_id) {
		LTIObject.resource_link_id = resource_link_id;
	}


	public String getContext_id() {
		return context_id;
	}


	public void setContext_id(String context_id) {
		this.context_id = context_id;
	}


	public String getUser_id() {
		return user_id;
	}


	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}


	public Collection<GrantedAuthority> getRoles() {
		return roles;
	}


	public void setRoles(Collection<GrantedAuthority> roles) {
		this.roles = roles;
	}


}
