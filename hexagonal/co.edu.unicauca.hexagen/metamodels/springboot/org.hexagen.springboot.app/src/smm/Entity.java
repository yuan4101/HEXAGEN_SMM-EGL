/**
 */
package smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smm.Entity#getTableName <em>Table Name</em>}</li>
 *   <li>{@link smm.Entity#getIdGenerationStrategy <em>Id Generation Strategy</em>}</li>
 *   <li>{@link smm.Entity#getRelationships <em>Relationships</em>}</li>
 * </ul>
 *
 * @see smm.SmmPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends JavaClass {
	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see smm.SmmPackage#getEntity_TableName()
	 * @model
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link smm.Entity#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

	/**
	 * Returns the value of the '<em><b>Id Generation Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link smm.GenerationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Generation Strategy</em>' attribute.
	 * @see smm.GenerationType
	 * @see #setIdGenerationStrategy(GenerationType)
	 * @see smm.SmmPackage#getEntity_IdGenerationStrategy()
	 * @model
	 * @generated
	 */
	GenerationType getIdGenerationStrategy();

	/**
	 * Sets the value of the '{@link smm.Entity#getIdGenerationStrategy <em>Id Generation Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Generation Strategy</em>' attribute.
	 * @see smm.GenerationType
	 * @see #getIdGenerationStrategy()
	 * @generated
	 */
	void setIdGenerationStrategy(GenerationType value);

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link smm.Relationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see smm.SmmPackage#getEntity_Relationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relationship> getRelationships();

} // Entity
