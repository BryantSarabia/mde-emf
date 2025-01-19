/**
 */
package RefinedStreamingPlatform.impl;

import RefinedStreamingPlatform.Currency;
import RefinedStreamingPlatform.Monetization;
import RefinedStreamingPlatform.PaymentMethod;
import RefinedStreamingPlatform.PaymentStatus;
import RefinedStreamingPlatform.RefinedStreamingPlatformPackage;
import RefinedStreamingPlatform.RefinedStreamingPlatformTables;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.RealValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monetization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RefinedStreamingPlatform.impl.MonetizationImpl#getMonetizationID <em>Monetization ID</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.MonetizationImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.MonetizationImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.MonetizationImpl#getTransactionDate <em>Transaction Date</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.MonetizationImpl#getPaymentStatus <em>Payment Status</em>}</li>
 *   <li>{@link RefinedStreamingPlatform.impl.MonetizationImpl#getPaymentMethod <em>Payment Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MonetizationImpl extends MinimalEObjectImpl.Container implements Monetization {
	/**
	 * The default value of the '{@link #getMonetizationID() <em>Monetization ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonetizationID()
	 * @generated
	 * @ordered
	 */
	protected static final int MONETIZATION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMonetizationID() <em>Monetization ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonetizationID()
	 * @generated
	 * @ordered
	 */
	protected int monetizationID = MONETIZATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected float amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected static final Currency CURRENCY_EDEFAULT = Currency.EUR;

	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected Currency currency = CURRENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactionDate() <em>Transaction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date TRANSACTION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionDate() <em>Transaction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionDate()
	 * @generated
	 * @ordered
	 */
	protected Date transactionDate = TRANSACTION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentStatus() <em>Payment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentStatus()
	 * @generated
	 * @ordered
	 */
	protected static final PaymentStatus PAYMENT_STATUS_EDEFAULT = PaymentStatus.PENDING;

	/**
	 * The cached value of the '{@link #getPaymentStatus() <em>Payment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentStatus()
	 * @generated
	 * @ordered
	 */
	protected PaymentStatus paymentStatus = PAYMENT_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentMethod() <em>Payment Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethod()
	 * @generated
	 * @ordered
	 */
	protected static final PaymentMethod PAYMENT_METHOD_EDEFAULT = PaymentMethod.PAYPAL;

	/**
	 * The cached value of the '{@link #getPaymentMethod() <em>Payment Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethod()
	 * @generated
	 * @ordered
	 */
	protected PaymentMethod paymentMethod = PAYMENT_METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonetizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefinedStreamingPlatformPackage.Literals.MONETIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMonetizationID() {
		return monetizationID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonetizationID(int newMonetizationID) {
		int oldMonetizationID = monetizationID;
		monetizationID = newMonetizationID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.MONETIZATION__MONETIZATION_ID, oldMonetizationID, monetizationID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(float newAmount) {
		float oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.MONETIZATION__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Currency getCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrency(Currency newCurrency) {
		Currency oldCurrency = currency;
		currency = newCurrency == null ? CURRENCY_EDEFAULT : newCurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.MONETIZATION__CURRENCY, oldCurrency, currency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTransactionDate() {
		return transactionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactionDate(Date newTransactionDate) {
		Date oldTransactionDate = transactionDate;
		transactionDate = newTransactionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.MONETIZATION__TRANSACTION_DATE, oldTransactionDate, transactionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentStatus(PaymentStatus newPaymentStatus) {
		PaymentStatus oldPaymentStatus = paymentStatus;
		paymentStatus = newPaymentStatus == null ? PAYMENT_STATUS_EDEFAULT : newPaymentStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.MONETIZATION__PAYMENT_STATUS, oldPaymentStatus, paymentStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethod(PaymentMethod newPaymentMethod) {
		PaymentMethod oldPaymentMethod = paymentMethod;
		paymentMethod = newPaymentMethod == null ? PAYMENT_METHOD_EDEFAULT : newPaymentMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefinedStreamingPlatformPackage.MONETIZATION__PAYMENT_METHOD, oldPaymentMethod, paymentMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean positiveAmount(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Monetization::positiveAmount";
		try {
			/**
			 *
			 * inv positiveAmount:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = amount >= 0.0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, RefinedStreamingPlatformPackage.Literals.MONETIZATION___POSITIVE_AMOUNT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, RefinedStreamingPlatformTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ float amount = this.getAmount();
				final /*@NonInvalid*/ RealValue BOXED_amount = ValueUtil.realValueOf(amount);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_amount, RefinedStreamingPlatformTables.REA_0_0).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, RefinedStreamingPlatformTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefinedStreamingPlatformPackage.MONETIZATION__MONETIZATION_ID:
				return getMonetizationID();
			case RefinedStreamingPlatformPackage.MONETIZATION__AMOUNT:
				return getAmount();
			case RefinedStreamingPlatformPackage.MONETIZATION__CURRENCY:
				return getCurrency();
			case RefinedStreamingPlatformPackage.MONETIZATION__TRANSACTION_DATE:
				return getTransactionDate();
			case RefinedStreamingPlatformPackage.MONETIZATION__PAYMENT_STATUS:
				return getPaymentStatus();
			case RefinedStreamingPlatformPackage.MONETIZATION__PAYMENT_METHOD:
				return getPaymentMethod();
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
			case RefinedStreamingPlatformPackage.MONETIZATION__MONETIZATION_ID:
				setMonetizationID((Integer)newValue);
				return;
			case RefinedStreamingPlatformPackage.MONETIZATION__AMOUNT:
				setAmount((Float)newValue);
				return;
			case RefinedStreamingPlatformPackage.MONETIZATION__CURRENCY:
				setCurrency((Currency)newValue);
				return;
			case RefinedStreamingPlatformPackage.MONETIZATION__TRANSACTION_DATE:
				setTransactionDate((Date)newValue);
				return;
			case RefinedStreamingPlatformPackage.MONETIZATION__PAYMENT_STATUS:
				setPaymentStatus((PaymentStatus)newValue);
				return;
			case RefinedStreamingPlatformPackage.MONETIZATION__PAYMENT_METHOD:
				setPaymentMethod((PaymentMethod)newValue);
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
			case RefinedStreamingPlatformPackage.MONETIZATION__MONETIZATION_ID:
				setMonetizationID(MONETIZATION_ID_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.MONETIZATION__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.MONETIZATION__CURRENCY:
				setCurrency(CURRENCY_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.MONETIZATION__TRANSACTION_DATE:
				setTransactionDate(TRANSACTION_DATE_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.MONETIZATION__PAYMENT_STATUS:
				setPaymentStatus(PAYMENT_STATUS_EDEFAULT);
				return;
			case RefinedStreamingPlatformPackage.MONETIZATION__PAYMENT_METHOD:
				setPaymentMethod(PAYMENT_METHOD_EDEFAULT);
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
			case RefinedStreamingPlatformPackage.MONETIZATION__MONETIZATION_ID:
				return monetizationID != MONETIZATION_ID_EDEFAULT;
			case RefinedStreamingPlatformPackage.MONETIZATION__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case RefinedStreamingPlatformPackage.MONETIZATION__CURRENCY:
				return currency != CURRENCY_EDEFAULT;
			case RefinedStreamingPlatformPackage.MONETIZATION__TRANSACTION_DATE:
				return TRANSACTION_DATE_EDEFAULT == null ? transactionDate != null : !TRANSACTION_DATE_EDEFAULT.equals(transactionDate);
			case RefinedStreamingPlatformPackage.MONETIZATION__PAYMENT_STATUS:
				return paymentStatus != PAYMENT_STATUS_EDEFAULT;
			case RefinedStreamingPlatformPackage.MONETIZATION__PAYMENT_METHOD:
				return paymentMethod != PAYMENT_METHOD_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RefinedStreamingPlatformPackage.MONETIZATION___POSITIVE_AMOUNT__DIAGNOSTICCHAIN_MAP:
				return positiveAmount((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (monetizationID: ");
		result.append(monetizationID);
		result.append(", amount: ");
		result.append(amount);
		result.append(", currency: ");
		result.append(currency);
		result.append(", transactionDate: ");
		result.append(transactionDate);
		result.append(", paymentStatus: ");
		result.append(paymentStatus);
		result.append(", paymentMethod: ");
		result.append(paymentMethod);
		result.append(')');
		return result.toString();
	}

} //MonetizationImpl