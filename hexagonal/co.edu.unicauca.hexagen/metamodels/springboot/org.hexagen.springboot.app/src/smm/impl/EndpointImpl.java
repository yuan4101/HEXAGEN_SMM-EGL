/**
 */
package smm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import smm.DTO;
import smm.Endpoint;
import smm.HttpMethod;
import smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smm.impl.EndpointImpl#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link smm.impl.EndpointImpl#getPath <em>Path</em>}</li>
 *   <li>{@link smm.impl.EndpointImpl#getResponseCode <em>Response Code</em>}</li>
 *   <li>{@link smm.impl.EndpointImpl#getRequestDTO <em>Request DTO</em>}</li>
 *   <li>{@link smm.impl.EndpointImpl#getResponseDTO <em>Response DTO</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndpointImpl extends MethodImpl implements Endpoint {
	/**
	 * The default value of the '{@link #getHttpMethod() <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpMethod()
	 * @generated
	 * @ordered
	 */
	protected static final HttpMethod HTTP_METHOD_EDEFAULT = HttpMethod.GET;

	/**
	 * The cached value of the '{@link #getHttpMethod() <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpMethod()
	 * @generated
	 * @ordered
	 */
	protected HttpMethod httpMethod = HTTP_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponseCode() <em>Response Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseCode()
	 * @generated
	 * @ordered
	 */
	protected static final int RESPONSE_CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResponseCode() <em>Response Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseCode()
	 * @generated
	 * @ordered
	 */
	protected int responseCode = RESPONSE_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequestDTO() <em>Request DTO</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestDTO()
	 * @generated
	 * @ordered
	 */
	protected DTO requestDTO;

	/**
	 * The cached value of the '{@link #getResponseDTO() <em>Response DTO</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseDTO()
	 * @generated
	 * @ordered
	 */
	protected DTO responseDTO;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.ENDPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HttpMethod getHttpMethod() {
		return httpMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHttpMethod(HttpMethod newHttpMethod) {
		HttpMethod oldHttpMethod = httpMethod;
		httpMethod = newHttpMethod == null ? HTTP_METHOD_EDEFAULT : newHttpMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.ENDPOINT__HTTP_METHOD, oldHttpMethod, httpMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.ENDPOINT__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getResponseCode() {
		return responseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseCode(int newResponseCode) {
		int oldResponseCode = responseCode;
		responseCode = newResponseCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.ENDPOINT__RESPONSE_CODE, oldResponseCode, responseCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DTO getRequestDTO() {
		if (requestDTO != null && requestDTO.eIsProxy()) {
			InternalEObject oldRequestDTO = (InternalEObject)requestDTO;
			requestDTO = (DTO)eResolveProxy(oldRequestDTO);
			if (requestDTO != oldRequestDTO) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.ENDPOINT__REQUEST_DTO, oldRequestDTO, requestDTO));
			}
		}
		return requestDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTO basicGetRequestDTO() {
		return requestDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestDTO(DTO newRequestDTO) {
		DTO oldRequestDTO = requestDTO;
		requestDTO = newRequestDTO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.ENDPOINT__REQUEST_DTO, oldRequestDTO, requestDTO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DTO getResponseDTO() {
		if (responseDTO != null && responseDTO.eIsProxy()) {
			InternalEObject oldResponseDTO = (InternalEObject)responseDTO;
			responseDTO = (DTO)eResolveProxy(oldResponseDTO);
			if (responseDTO != oldResponseDTO) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.ENDPOINT__RESPONSE_DTO, oldResponseDTO, responseDTO));
			}
		}
		return responseDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTO basicGetResponseDTO() {
		return responseDTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseDTO(DTO newResponseDTO) {
		DTO oldResponseDTO = responseDTO;
		responseDTO = newResponseDTO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.ENDPOINT__RESPONSE_DTO, oldResponseDTO, responseDTO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmmPackage.ENDPOINT__HTTP_METHOD:
				return getHttpMethod();
			case SmmPackage.ENDPOINT__PATH:
				return getPath();
			case SmmPackage.ENDPOINT__RESPONSE_CODE:
				return getResponseCode();
			case SmmPackage.ENDPOINT__REQUEST_DTO:
				if (resolve) return getRequestDTO();
				return basicGetRequestDTO();
			case SmmPackage.ENDPOINT__RESPONSE_DTO:
				if (resolve) return getResponseDTO();
				return basicGetResponseDTO();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmmPackage.ENDPOINT__HTTP_METHOD:
				setHttpMethod((HttpMethod)newValue);
				return;
			case SmmPackage.ENDPOINT__PATH:
				setPath((String)newValue);
				return;
			case SmmPackage.ENDPOINT__RESPONSE_CODE:
				setResponseCode((Integer)newValue);
				return;
			case SmmPackage.ENDPOINT__REQUEST_DTO:
				setRequestDTO((DTO)newValue);
				return;
			case SmmPackage.ENDPOINT__RESPONSE_DTO:
				setResponseDTO((DTO)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SmmPackage.ENDPOINT__HTTP_METHOD:
				setHttpMethod(HTTP_METHOD_EDEFAULT);
				return;
			case SmmPackage.ENDPOINT__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case SmmPackage.ENDPOINT__RESPONSE_CODE:
				setResponseCode(RESPONSE_CODE_EDEFAULT);
				return;
			case SmmPackage.ENDPOINT__REQUEST_DTO:
				setRequestDTO((DTO)null);
				return;
			case SmmPackage.ENDPOINT__RESPONSE_DTO:
				setResponseDTO((DTO)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SmmPackage.ENDPOINT__HTTP_METHOD:
				return httpMethod != HTTP_METHOD_EDEFAULT;
			case SmmPackage.ENDPOINT__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case SmmPackage.ENDPOINT__RESPONSE_CODE:
				return responseCode != RESPONSE_CODE_EDEFAULT;
			case SmmPackage.ENDPOINT__REQUEST_DTO:
				return requestDTO != null;
			case SmmPackage.ENDPOINT__RESPONSE_DTO:
				return responseDTO != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (httpMethod: ");
		result.append(httpMethod);
		result.append(", path: ");
		result.append(path);
		result.append(", responseCode: ");
		result.append(responseCode);
		result.append(')');
		return result.toString();
	}

} //EndpointImpl
