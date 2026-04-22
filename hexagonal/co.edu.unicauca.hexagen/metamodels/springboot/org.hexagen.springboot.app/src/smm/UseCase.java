/**
 */
package smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smm.UseCase#isTransactional <em>Transactional</em>}</li>
 * </ul>
 *
 * @see smm.SmmPackage#getUseCase()
 * @model
 * @generated
 */
public interface UseCase extends Method {
	/**
	 * Returns the value of the '<em><b>Transactional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactional</em>' attribute.
	 * @see #setTransactional(boolean)
	 * @see smm.SmmPackage#getUseCase_Transactional()
	 * @model
	 * @generated
	 */
	boolean isTransactional();

	/**
	 * Sets the value of the '{@link smm.UseCase#isTransactional <em>Transactional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transactional</em>' attribute.
	 * @see #isTransactional()
	 * @generated
	 */
	void setTransactional(boolean value);

} // UseCase
