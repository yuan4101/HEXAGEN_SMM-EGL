/**
 */
package smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smm.Endpoint#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link smm.Endpoint#getPath <em>Path</em>}</li>
 *   <li>{@link smm.Endpoint#getResponseCode <em>Response Code</em>}</li>
 *   <li>{@link smm.Endpoint#getRequestDTO <em>Request DTO</em>}</li>
 *   <li>{@link smm.Endpoint#getResponseDTO <em>Response DTO</em>}</li>
 * </ul>
 *
 * @see smm.SmmPackage#getEndpoint()
 * @model
 * @generated
 */
public interface Endpoint extends Method {
	/**
	 * Returns the value of the '<em><b>Http Method</b></em>' attribute.
	 * The literals are from the enumeration {@link smm.HttpMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Method</em>' attribute.
	 * @see smm.HttpMethod
	 * @see #setHttpMethod(HttpMethod)
	 * @see smm.SmmPackage#getEndpoint_HttpMethod()
	 * @model
	 * @generated
	 */
	HttpMethod getHttpMethod();

	/**
	 * Sets the value of the '{@link smm.Endpoint#getHttpMethod <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Method</em>' attribute.
	 * @see smm.HttpMethod
	 * @see #getHttpMethod()
	 * @generated
	 */
	void setHttpMethod(HttpMethod value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see smm.SmmPackage#getEndpoint_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link smm.Endpoint#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Response Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Code</em>' attribute.
	 * @see #setResponseCode(int)
	 * @see smm.SmmPackage#getEndpoint_ResponseCode()
	 * @model
	 * @generated
	 */
	int getResponseCode();

	/**
	 * Sets the value of the '{@link smm.Endpoint#getResponseCode <em>Response Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Code</em>' attribute.
	 * @see #getResponseCode()
	 * @generated
	 */
	void setResponseCode(int value);

	/**
	 * Returns the value of the '<em><b>Request DTO</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request DTO</em>' reference.
	 * @see #setRequestDTO(DTO)
	 * @see smm.SmmPackage#getEndpoint_RequestDTO()
	 * @model
	 * @generated
	 */
	DTO getRequestDTO();

	/**
	 * Sets the value of the '{@link smm.Endpoint#getRequestDTO <em>Request DTO</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request DTO</em>' reference.
	 * @see #getRequestDTO()
	 * @generated
	 */
	void setRequestDTO(DTO value);

	/**
	 * Returns the value of the '<em><b>Response DTO</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response DTO</em>' reference.
	 * @see #setResponseDTO(DTO)
	 * @see smm.SmmPackage#getEndpoint_ResponseDTO()
	 * @model
	 * @generated
	 */
	DTO getResponseDTO();

	/**
	 * Sets the value of the '{@link smm.Endpoint#getResponseDTO <em>Response DTO</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response DTO</em>' reference.
	 * @see #getResponseDTO()
	 * @generated
	 */
	void setResponseDTO(DTO value);

} // Endpoint
