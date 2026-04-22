/**
 */
package smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smm.Service#getUseCases <em>Use Cases</em>}</li>
 *   <li>{@link smm.Service#getRepositories <em>Repositories</em>}</li>
 * </ul>
 *
 * @see smm.SmmPackage#getService()
 * @model
 * @generated
 */
public interface Service extends JavaClass {
	/**
	 * Returns the value of the '<em><b>Use Cases</b></em>' containment reference list.
	 * The list contents are of type {@link smm.UseCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Cases</em>' containment reference list.
	 * @see smm.SmmPackage#getService_UseCases()
	 * @model containment="true"
	 * @generated
	 */
	EList<UseCase> getUseCases();

	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' reference list.
	 * The list contents are of type {@link smm.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositories</em>' reference list.
	 * @see smm.SmmPackage#getService_Repositories()
	 * @model
	 * @generated
	 */
	EList<Repository> getRepositories();

} // Service
