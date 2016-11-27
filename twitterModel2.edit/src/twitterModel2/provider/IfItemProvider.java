/**
 */
package twitterModel2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import twitterModel2.If;
import twitterModel2.TwitterModel2Factory;
import twitterModel2.TwitterModel2Package;

/**
 * This is the item provider adapter for a {@link twitterModel2.If} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addElseBlockPropertyDescriptor(object);
			addIfBlockPropertyDescriptor(object);
			addConditionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Else Block feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElseBlockPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_If_elseBlock_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_If_elseBlock_feature", "_UI_If_type"),
				 TwitterModel2Package.Literals.IF__ELSE_BLOCK,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the If Block feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIfBlockPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_If_ifBlock_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_If_ifBlock_feature", "_UI_If_type"),
				 TwitterModel2Package.Literals.IF__IF_BLOCK,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_If_condition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_If_condition_feature", "_UI_If_type"),
				 TwitterModel2Package.Literals.IF__CONDITION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TwitterModel2Package.Literals.IF__ELSE_BLOCK);
			childrenFeatures.add(TwitterModel2Package.Literals.IF__IF_BLOCK);
			childrenFeatures.add(TwitterModel2Package.Literals.IF__CONDITION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns If.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/If"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_If_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(If.class)) {
			case TwitterModel2Package.IF__ELSE_BLOCK:
			case TwitterModel2Package.IF__IF_BLOCK:
			case TwitterModel2Package.IF__CONDITION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.IF__ELSE_BLOCK,
				 TwitterModel2Factory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.IF__IF_BLOCK,
				 TwitterModel2Factory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.IF__CONDITION,
				 TwitterModel2Factory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.IF__CONDITION,
				 TwitterModel2Factory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.IF__CONDITION,
				 TwitterModel2Factory.eINSTANCE.createXor()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.IF__CONDITION,
				 TwitterModel2Factory.eINSTANCE.createGreater()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.IF__CONDITION,
				 TwitterModel2Factory.eINSTANCE.createLess()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.IF__CONDITION,
				 TwitterModel2Factory.eINSTANCE.createEqual()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterModel2Package.Literals.IF__CONDITION,
				 TwitterModel2Factory.eINSTANCE.createSupEgal()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == TwitterModel2Package.Literals.IF__ELSE_BLOCK ||
			childFeature == TwitterModel2Package.Literals.IF__IF_BLOCK;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
