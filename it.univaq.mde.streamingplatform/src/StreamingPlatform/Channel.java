/**
 */
package StreamingPlatform;

import java.util.UUID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StreamingPlatform.Channel#getChannelID <em>Channel ID</em>}</li>
 *   <li>{@link StreamingPlatform.Channel#getDescription <em>Description</em>}</li>
 *   <li>{@link StreamingPlatform.Channel#getStreams <em>Streams</em>}</li>
 *   <li>{@link StreamingPlatform.Channel#getClips <em>Clips</em>}</li>
 *   <li>{@link StreamingPlatform.Channel#getModerators <em>Moderators</em>}</li>
 *   <li>{@link StreamingPlatform.Channel#getFollowers <em>Followers</em>}</li>
 *   <li>{@link StreamingPlatform.Channel#getDonations <em>Donations</em>}</li>
 *   <li>{@link StreamingPlatform.Channel#getSubscriptions <em>Subscriptions</em>}</li>
 *   <li>{@link StreamingPlatform.Channel#getEmotes <em>Emotes</em>}</li>
 *   <li>{@link StreamingPlatform.Channel#getBadges <em>Badges</em>}</li>
 *   <li>{@link StreamingPlatform.Channel#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see StreamingPlatform.StreamingPlatformPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends Auditable, NamedElement {
	/**
	 * Returns the value of the '<em><b>Channel ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel ID</em>' attribute.
	 * @see #setChannelID(UUID)
	 * @see StreamingPlatform.StreamingPlatformPackage#getChannel_ChannelID()
	 * @model id="true" dataType="StreamingPlatform.UUID"
	 * @generated
	 */
	UUID getChannelID();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Channel#getChannelID <em>Channel ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel ID</em>' attribute.
	 * @see #getChannelID()
	 * @generated
	 */
	void setChannelID(UUID value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see StreamingPlatform.StreamingPlatformPackage#getChannel_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Channel#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Streams</b></em>' containment reference list.
	 * The list contents are of type {@link StreamingPlatform.Stream}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Streams</em>' containment reference list.
	 * @see StreamingPlatform.StreamingPlatformPackage#getChannel_Streams()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stream> getStreams();

	/**
	 * Returns the value of the '<em><b>Clips</b></em>' containment reference list.
	 * The list contents are of type {@link StreamingPlatform.Clip}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clips</em>' containment reference list.
	 * @see StreamingPlatform.StreamingPlatformPackage#getChannel_Clips()
	 * @model containment="true"
	 * @generated
	 */
	EList<Clip> getClips();

	/**
	 * Returns the value of the '<em><b>Moderators</b></em>' reference list.
	 * The list contents are of type {@link StreamingPlatform.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moderators</em>' reference list.
	 * @see StreamingPlatform.StreamingPlatformPackage#getChannel_Moderators()
	 * @model
	 * @generated
	 */
	EList<User> getModerators();

	/**
	 * Returns the value of the '<em><b>Followers</b></em>' reference list.
	 * The list contents are of type {@link StreamingPlatform.User}.
	 * It is bidirectional and its opposite is '{@link StreamingPlatform.User#getFollowedChannels <em>Followed Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Followers</em>' reference list.
	 * @see StreamingPlatform.StreamingPlatformPackage#getChannel_Followers()
	 * @see StreamingPlatform.User#getFollowedChannels
	 * @model opposite="followedChannels"
	 * @generated
	 */
	EList<User> getFollowers();

	/**
	 * Returns the value of the '<em><b>Donations</b></em>' containment reference list.
	 * The list contents are of type {@link StreamingPlatform.Donation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Donations</em>' containment reference list.
	 * @see StreamingPlatform.StreamingPlatformPackage#getChannel_Donations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Donation> getDonations();

	/**
	 * Returns the value of the '<em><b>Subscriptions</b></em>' containment reference list.
	 * The list contents are of type {@link StreamingPlatform.Subscription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriptions</em>' containment reference list.
	 * @see StreamingPlatform.StreamingPlatformPackage#getChannel_Subscriptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subscription> getSubscriptions();

	/**
	 * Returns the value of the '<em><b>Emotes</b></em>' containment reference list.
	 * The list contents are of type {@link StreamingPlatform.Emote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emotes</em>' containment reference list.
	 * @see StreamingPlatform.StreamingPlatformPackage#getChannel_Emotes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Emote> getEmotes();

	/**
	 * Returns the value of the '<em><b>Badges</b></em>' containment reference list.
	 * The list contents are of type {@link StreamingPlatform.Badge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Badges</em>' containment reference list.
	 * @see StreamingPlatform.StreamingPlatformPackage#getChannel_Badges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Badge> getBadges();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(User)
	 * @see StreamingPlatform.StreamingPlatformPackage#getChannel_Owner()
	 * @model required="true"
	 * @generated
	 */
	User getOwner();

	/**
	 * Sets the value of the '{@link StreamingPlatform.Channel#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(User value);

} // Channel
