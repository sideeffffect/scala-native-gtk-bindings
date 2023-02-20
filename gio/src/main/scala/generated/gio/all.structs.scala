package gio
package all

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

export _root_.gio.structs.GAction
export _root_.gio.structs.GActionEntry
export _root_.gio.structs.GActionGroup
export _root_.gio.structs.GActionGroupInterface
export _root_.gio.structs.GActionInterface
export _root_.gio.structs.GActionMap
export _root_.gio.structs.GActionMapInterface
export _root_.gio.structs.GAppInfo
export _root_.gio.structs.GAppInfoIface
export _root_.gio.structs.GAppInfoMonitor
export _root_.gio.structs.GAppLaunchContext
export _root_.gio.structs.GAppLaunchContextClass
export _root_.gio.structs.GAppLaunchContextPrivate
export _root_.gio.structs.GApplication
export _root_.gio.structs.GApplicationClass
export _root_.gio.structs.GApplicationCommandLine
export _root_.gio.structs.GApplicationCommandLineClass
export _root_.gio.structs.GApplicationCommandLinePrivate
export _root_.gio.structs.GApplicationPrivate
export _root_.gio.structs.GAsyncInitable
export _root_.gio.structs.GAsyncInitableIface
export _root_.gio.structs.GAsyncResult
export _root_.gio.structs.GAsyncResultIface
export _root_.gio.structs.GBufferedInputStream
export _root_.gio.structs.GBufferedInputStreamClass
export _root_.gio.structs.GBufferedInputStreamPrivate
export _root_.gio.structs.GBufferedOutputStream
export _root_.gio.structs.GBufferedOutputStreamClass
export _root_.gio.structs.GBufferedOutputStreamPrivate
export _root_.gio.structs.GBytesIcon
export _root_.gio.structs.GCancellable
export _root_.gio.structs.GCancellableClass
export _root_.gio.structs.GCancellablePrivate
export _root_.gio.structs.GCharsetConverter
export _root_.gio.structs.GCharsetConverterClass
export _root_.gio.structs.GConverter
export _root_.gio.structs.GConverterIface
export _root_.gio.structs.GConverterInputStream
export _root_.gio.structs.GConverterInputStreamClass
export _root_.gio.structs.GConverterInputStreamPrivate
export _root_.gio.structs.GConverterOutputStream
export _root_.gio.structs.GConverterOutputStreamClass
export _root_.gio.structs.GConverterOutputStreamPrivate
export _root_.gio.structs.GCredentials
export _root_.gio.structs.GCredentialsClass
export _root_.gio.structs.GDBusActionGroup
export _root_.gio.structs.GDBusAnnotationInfo
export _root_.gio.structs.GDBusArgInfo
export _root_.gio.structs.GDBusAuthObserver
export _root_.gio.structs.GDBusConnection
export _root_.gio.structs.GDBusErrorEntry
export _root_.gio.structs.GDBusInterface
export _root_.gio.structs.GDBusInterfaceIface
export _root_.gio.structs.GDBusInterfaceInfo
export _root_.gio.structs.GDBusInterfaceSkeleton
export _root_.gio.structs.GDBusInterfaceSkeletonClass
export _root_.gio.structs.GDBusInterfaceSkeletonPrivate
export _root_.gio.structs.GDBusInterfaceVTable
export _root_.gio.structs.GDBusMenuModel
export _root_.gio.structs.GDBusMessage
export _root_.gio.structs.GDBusMethodInfo
export _root_.gio.structs.GDBusMethodInvocation
export _root_.gio.structs.GDBusNodeInfo
export _root_.gio.structs.GDBusObject
export _root_.gio.structs.GDBusObjectIface
export _root_.gio.structs.GDBusObjectManager
export _root_.gio.structs.GDBusObjectManagerClient
export _root_.gio.structs.GDBusObjectManagerClientClass
export _root_.gio.structs.GDBusObjectManagerClientPrivate
export _root_.gio.structs.GDBusObjectManagerIface
export _root_.gio.structs.GDBusObjectManagerServer
export _root_.gio.structs.GDBusObjectManagerServerClass
export _root_.gio.structs.GDBusObjectManagerServerPrivate
export _root_.gio.structs.GDBusObjectProxy
export _root_.gio.structs.GDBusObjectProxyClass
export _root_.gio.structs.GDBusObjectProxyPrivate
export _root_.gio.structs.GDBusObjectSkeleton
export _root_.gio.structs.GDBusObjectSkeletonClass
export _root_.gio.structs.GDBusObjectSkeletonPrivate
export _root_.gio.structs.GDBusPropertyInfo
export _root_.gio.structs.GDBusProxy
export _root_.gio.structs.GDBusProxyClass
export _root_.gio.structs.GDBusProxyPrivate
export _root_.gio.structs.GDBusServer
export _root_.gio.structs.GDBusSignalInfo
export _root_.gio.structs.GDBusSubtreeVTable
export _root_.gio.structs.GDataInputStream
export _root_.gio.structs.GDataInputStreamClass
export _root_.gio.structs.GDataInputStreamPrivate
export _root_.gio.structs.GDataOutputStream
export _root_.gio.structs.GDataOutputStreamClass
export _root_.gio.structs.GDataOutputStreamPrivate
export _root_.gio.structs.GDatagramBased
export _root_.gio.structs.GDatagramBasedInterface
export _root_.gio.structs.GDebugController
export _root_.gio.structs.GDebugControllerDBus
export _root_.gio.structs.GDebugControllerDBusClass
export _root_.gio.structs.GDebugControllerInterface
export _root_.gio.structs.GDrive
export _root_.gio.structs.GDriveIface
export _root_.gio.structs.GDtlsClientConnection
export _root_.gio.structs.GDtlsClientConnectionInterface
export _root_.gio.structs.GDtlsConnection
export _root_.gio.structs.GDtlsConnectionInterface
export _root_.gio.structs.GDtlsServerConnection
export _root_.gio.structs.GDtlsServerConnectionInterface
export _root_.gio.structs.GEmblem
export _root_.gio.structs.GEmblemClass
export _root_.gio.structs.GEmblemedIcon
export _root_.gio.structs.GEmblemedIconClass
export _root_.gio.structs.GEmblemedIconPrivate
export _root_.gio.structs.GFile
export _root_.gio.structs.GFileAttributeInfo
export _root_.gio.structs.GFileAttributeInfoList
export _root_.gio.structs.GFileAttributeMatcher
export _root_.gio.structs.GFileDescriptorBased
export _root_.gio.structs.GFileEnumerator
export _root_.gio.structs.GFileEnumeratorClass
export _root_.gio.structs.GFileEnumeratorPrivate
export _root_.gio.structs.GFileIOStream
export _root_.gio.structs.GFileIOStreamClass
export _root_.gio.structs.GFileIOStreamPrivate
export _root_.gio.structs.GFileIcon
export _root_.gio.structs.GFileIconClass
export _root_.gio.structs.GFileIface
export _root_.gio.structs.GFileInfo
export _root_.gio.structs.GFileInfoClass
export _root_.gio.structs.GFileInputStream
export _root_.gio.structs.GFileInputStreamClass
export _root_.gio.structs.GFileInputStreamPrivate
export _root_.gio.structs.GFileMonitor
export _root_.gio.structs.GFileMonitorClass
export _root_.gio.structs.GFileMonitorPrivate
export _root_.gio.structs.GFileOutputStream
export _root_.gio.structs.GFileOutputStreamClass
export _root_.gio.structs.GFileOutputStreamPrivate
export _root_.gio.structs.GFilenameCompleter
export _root_.gio.structs.GFilenameCompleterClass
export _root_.gio.structs.GFilterInputStream
export _root_.gio.structs.GFilterInputStreamClass
export _root_.gio.structs.GFilterOutputStream
export _root_.gio.structs.GFilterOutputStreamClass
export _root_.gio.structs.GIOExtension
export _root_.gio.structs.GIOExtensionPoint
export _root_.gio.structs.GIOModule
export _root_.gio.structs.GIOModuleClass
export _root_.gio.structs.GIOModuleScope
export _root_.gio.structs.GIOSchedulerJob
export _root_.gio.structs.GIOStream
export _root_.gio.structs.GIOStreamAdapter
export _root_.gio.structs.GIOStreamClass
export _root_.gio.structs.GIOStreamPrivate
export _root_.gio.structs.GIcon
export _root_.gio.structs.GIconIface
export _root_.gio.structs.GInetAddress
export _root_.gio.structs.GInetAddressClass
export _root_.gio.structs.GInetAddressMask
export _root_.gio.structs.GInetAddressMaskClass
export _root_.gio.structs.GInetAddressMaskPrivate
export _root_.gio.structs.GInetAddressPrivate
export _root_.gio.structs.GInetSocketAddress
export _root_.gio.structs.GInetSocketAddressClass
export _root_.gio.structs.GInetSocketAddressPrivate
export _root_.gio.structs.GInitable
export _root_.gio.structs.GInitableIface
export _root_.gio.structs.GInputMessage
export _root_.gio.structs.GInputStream
export _root_.gio.structs.GInputStreamClass
export _root_.gio.structs.GInputStreamPrivate
export _root_.gio.structs.GInputVector
export _root_.gio.structs.GListModel
export _root_.gio.structs.GListModelInterface
export _root_.gio.structs.GListStore
export _root_.gio.structs.GListStoreClass
export _root_.gio.structs.GLoadableIcon
export _root_.gio.structs.GLoadableIconIface
export _root_.gio.structs.GMemoryInputStream
export _root_.gio.structs.GMemoryInputStreamClass
export _root_.gio.structs.GMemoryInputStreamPrivate
export _root_.gio.structs.GMemoryMonitor
export _root_.gio.structs.GMemoryMonitorInterface
export _root_.gio.structs.GMemoryOutputStream
export _root_.gio.structs.GMemoryOutputStreamClass
export _root_.gio.structs.GMemoryOutputStreamPrivate
export _root_.gio.structs.GMenu
export _root_.gio.structs.GMenuAttributeIter
export _root_.gio.structs.GMenuAttributeIterClass
export _root_.gio.structs.GMenuAttributeIterPrivate
export _root_.gio.structs.GMenuItem
export _root_.gio.structs.GMenuLinkIter
export _root_.gio.structs.GMenuLinkIterClass
export _root_.gio.structs.GMenuLinkIterPrivate
export _root_.gio.structs.GMenuModel
export _root_.gio.structs.GMenuModelClass
export _root_.gio.structs.GMenuModelPrivate
export _root_.gio.structs.GMount
export _root_.gio.structs.GMountIface
export _root_.gio.structs.GMountOperation
export _root_.gio.structs.GMountOperationClass
export _root_.gio.structs.GMountOperationPrivate
export _root_.gio.structs.GNativeSocketAddress
export _root_.gio.structs.GNativeSocketAddressClass
export _root_.gio.structs.GNativeSocketAddressPrivate
export _root_.gio.structs.GNativeVolumeMonitor
export _root_.gio.structs.GNativeVolumeMonitorClass
export _root_.gio.structs.GNetworkAddress
export _root_.gio.structs.GNetworkAddressClass
export _root_.gio.structs.GNetworkAddressPrivate
export _root_.gio.structs.GNetworkMonitor
export _root_.gio.structs.GNetworkMonitorInterface
export _root_.gio.structs.GNetworkService
export _root_.gio.structs.GNetworkServiceClass
export _root_.gio.structs.GNetworkServicePrivate
export _root_.gio.structs.GNotification
export _root_.gio.structs.GOutputMessage
export _root_.gio.structs.GOutputStream
export _root_.gio.structs.GOutputStreamClass
export _root_.gio.structs.GOutputStreamPrivate
export _root_.gio.structs.GOutputVector
export _root_.gio.structs.GPermission
export _root_.gio.structs.GPermissionClass
export _root_.gio.structs.GPermissionPrivate
export _root_.gio.structs.GPollableInputStream
export _root_.gio.structs.GPollableInputStreamInterface
export _root_.gio.structs.GPollableOutputStream
export _root_.gio.structs.GPollableOutputStreamInterface
export _root_.gio.structs.GPowerProfileMonitor
export _root_.gio.structs.GPowerProfileMonitorInterface
export _root_.gio.structs.GPropertyAction
export _root_.gio.structs.GProxy
export _root_.gio.structs.GProxyAddress
export _root_.gio.structs.GProxyAddressClass
export _root_.gio.structs.GProxyAddressEnumerator
export _root_.gio.structs.GProxyAddressEnumeratorClass
export _root_.gio.structs.GProxyAddressEnumeratorPrivate
export _root_.gio.structs.GProxyAddressPrivate
export _root_.gio.structs.GProxyInterface
export _root_.gio.structs.GProxyResolver
export _root_.gio.structs.GProxyResolverInterface
export _root_.gio.structs.GRemoteActionGroup
export _root_.gio.structs.GRemoteActionGroupInterface
export _root_.gio.structs.GResolver
export _root_.gio.structs.GResolverClass
export _root_.gio.structs.GResolverPrivate
export _root_.gio.structs.GResource
export _root_.gio.structs.GSeekable
export _root_.gio.structs.GSeekableIface
export _root_.gio.structs.GSettings
export _root_.gio.structs.GSettingsBackend
export _root_.gio.structs.GSettingsClass
export _root_.gio.structs.GSettingsPrivate
export _root_.gio.structs.GSettingsSchema
export _root_.gio.structs.GSettingsSchemaKey
export _root_.gio.structs.GSettingsSchemaSource
export _root_.gio.structs.GSimpleAction
export _root_.gio.structs.GSimpleActionGroup
export _root_.gio.structs.GSimpleActionGroupClass
export _root_.gio.structs.GSimpleActionGroupPrivate
export _root_.gio.structs.GSimpleAsyncResult
export _root_.gio.structs.GSimpleAsyncResultClass
export _root_.gio.structs.GSimpleIOStream
export _root_.gio.structs.GSimplePermission
export _root_.gio.structs.GSimpleProxyResolver
export _root_.gio.structs.GSimpleProxyResolverClass
export _root_.gio.structs.GSimpleProxyResolverPrivate
export _root_.gio.structs.GSocket
export _root_.gio.structs.GSocketAddress
export _root_.gio.structs.GSocketAddressClass
export _root_.gio.structs.GSocketAddressEnumerator
export _root_.gio.structs.GSocketAddressEnumeratorClass
export _root_.gio.structs.GSocketClass
export _root_.gio.structs.GSocketClient
export _root_.gio.structs.GSocketClientClass
export _root_.gio.structs.GSocketClientPrivate
export _root_.gio.structs.GSocketConnectable
export _root_.gio.structs.GSocketConnectableIface
export _root_.gio.structs.GSocketConnection
export _root_.gio.structs.GSocketConnectionClass
export _root_.gio.structs.GSocketConnectionPrivate
export _root_.gio.structs.GSocketControlMessage
export _root_.gio.structs.GSocketControlMessageClass
export _root_.gio.structs.GSocketControlMessagePrivate
export _root_.gio.structs.GSocketListener
export _root_.gio.structs.GSocketListenerClass
export _root_.gio.structs.GSocketListenerPrivate
export _root_.gio.structs.GSocketPrivate
export _root_.gio.structs.GSocketService
export _root_.gio.structs.GSocketServiceClass
export _root_.gio.structs.GSocketServicePrivate
export _root_.gio.structs.GSrvTarget
export _root_.gio.structs.GStaticResource
export _root_.gio.structs.GSubprocess
export _root_.gio.structs.GSubprocessLauncher
export _root_.gio.structs.GTask
export _root_.gio.structs.GTaskClass
export _root_.gio.structs.GTcpConnection
export _root_.gio.structs.GTcpConnectionClass
export _root_.gio.structs.GTcpConnectionPrivate
export _root_.gio.structs.GTcpWrapperConnection
export _root_.gio.structs.GTcpWrapperConnectionClass
export _root_.gio.structs.GTcpWrapperConnectionPrivate
export _root_.gio.structs.GTestDBus
export _root_.gio.structs.GThemedIcon
export _root_.gio.structs.GThemedIconClass
export _root_.gio.structs.GThreadedSocketService
export _root_.gio.structs.GThreadedSocketServiceClass
export _root_.gio.structs.GThreadedSocketServicePrivate
export _root_.gio.structs.GTlsBackend
export _root_.gio.structs.GTlsBackendInterface
export _root_.gio.structs.GTlsCertificate
export _root_.gio.structs.GTlsCertificateClass
export _root_.gio.structs.GTlsCertificatePrivate
export _root_.gio.structs.GTlsClientConnection
export _root_.gio.structs.GTlsClientConnectionInterface
export _root_.gio.structs.GTlsConnection
export _root_.gio.structs.GTlsConnectionClass
export _root_.gio.structs.GTlsConnectionPrivate
export _root_.gio.structs.GTlsDatabase
export _root_.gio.structs.GTlsDatabaseClass
export _root_.gio.structs.GTlsDatabasePrivate
export _root_.gio.structs.GTlsFileDatabase
export _root_.gio.structs.GTlsFileDatabaseInterface
export _root_.gio.structs.GTlsInteraction
export _root_.gio.structs.GTlsInteractionClass
export _root_.gio.structs.GTlsInteractionPrivate
export _root_.gio.structs.GTlsPassword
export _root_.gio.structs.GTlsPasswordClass
export _root_.gio.structs.GTlsPasswordPrivate
export _root_.gio.structs.GTlsServerConnection
export _root_.gio.structs.GTlsServerConnectionInterface
export _root_.gio.structs.GUnixCredentialsMessage
export _root_.gio.structs.GUnixFDList
export _root_.gio.structs.GVfs
export _root_.gio.structs.GVfsClass
export _root_.gio.structs.GVolume
export _root_.gio.structs.GVolumeIface
export _root_.gio.structs.GVolumeMonitor
export _root_.gio.structs.GVolumeMonitorClass
export _root_.gio.structs.GZlibCompressor
export _root_.gio.structs.GZlibCompressorClass
export _root_.gio.structs.GZlibDecompressor
export _root_.gio.structs.GZlibDecompressorClass
export _root_.gio.structs._GAction
export _root_.gio.structs._GActionEntry
export _root_.gio.structs._GActionGroup
export _root_.gio.structs._GActionGroupInterface
export _root_.gio.structs._GActionInterface
export _root_.gio.structs._GActionMap
export _root_.gio.structs._GActionMapInterface
export _root_.gio.structs._GAppInfo
export _root_.gio.structs._GAppInfoIface
export _root_.gio.structs._GAppInfoMonitor
export _root_.gio.structs._GAppLaunchContext
export _root_.gio.structs._GAppLaunchContextClass
export _root_.gio.structs._GAppLaunchContextPrivate
export _root_.gio.structs._GApplication
export _root_.gio.structs._GApplicationClass
export _root_.gio.structs._GApplicationCommandLine
export _root_.gio.structs._GApplicationCommandLineClass
export _root_.gio.structs._GApplicationCommandLinePrivate
export _root_.gio.structs._GApplicationPrivate
export _root_.gio.structs._GAsyncInitable
export _root_.gio.structs._GAsyncInitableIface
export _root_.gio.structs._GAsyncResult
export _root_.gio.structs._GAsyncResultIface
export _root_.gio.structs._GBufferedInputStream
export _root_.gio.structs._GBufferedInputStreamClass
export _root_.gio.structs._GBufferedInputStreamPrivate
export _root_.gio.structs._GBufferedOutputStream
export _root_.gio.structs._GBufferedOutputStreamClass
export _root_.gio.structs._GBufferedOutputStreamPrivate
export _root_.gio.structs._GBytesIcon
export _root_.gio.structs._GCancellable
export _root_.gio.structs._GCancellableClass
export _root_.gio.structs._GCancellablePrivate
export _root_.gio.structs._GCharsetConverter
export _root_.gio.structs._GCharsetConverterClass
export _root_.gio.structs._GConverter
export _root_.gio.structs._GConverterIface
export _root_.gio.structs._GConverterInputStream
export _root_.gio.structs._GConverterInputStreamClass
export _root_.gio.structs._GConverterInputStreamPrivate
export _root_.gio.structs._GConverterOutputStream
export _root_.gio.structs._GConverterOutputStreamClass
export _root_.gio.structs._GConverterOutputStreamPrivate
export _root_.gio.structs._GCredentials
export _root_.gio.structs._GCredentialsClass
export _root_.gio.structs._GDBusActionGroup
export _root_.gio.structs._GDBusAnnotationInfo
export _root_.gio.structs._GDBusArgInfo
export _root_.gio.structs._GDBusAuthObserver
export _root_.gio.structs._GDBusConnection
export _root_.gio.structs._GDBusErrorEntry
export _root_.gio.structs._GDBusInterface
export _root_.gio.structs._GDBusInterfaceIface
export _root_.gio.structs._GDBusInterfaceInfo
export _root_.gio.structs._GDBusInterfaceSkeleton
export _root_.gio.structs._GDBusInterfaceSkeletonClass
export _root_.gio.structs._GDBusInterfaceSkeletonPrivate
export _root_.gio.structs._GDBusInterfaceVTable
export _root_.gio.structs._GDBusMenuModel
export _root_.gio.structs._GDBusMessage
export _root_.gio.structs._GDBusMethodInfo
export _root_.gio.structs._GDBusMethodInvocation
export _root_.gio.structs._GDBusNodeInfo
export _root_.gio.structs._GDBusObject
export _root_.gio.structs._GDBusObjectIface
export _root_.gio.structs._GDBusObjectManager
export _root_.gio.structs._GDBusObjectManagerClient
export _root_.gio.structs._GDBusObjectManagerClientClass
export _root_.gio.structs._GDBusObjectManagerClientPrivate
export _root_.gio.structs._GDBusObjectManagerIface
export _root_.gio.structs._GDBusObjectManagerServer
export _root_.gio.structs._GDBusObjectManagerServerClass
export _root_.gio.structs._GDBusObjectManagerServerPrivate
export _root_.gio.structs._GDBusObjectProxy
export _root_.gio.structs._GDBusObjectProxyClass
export _root_.gio.structs._GDBusObjectProxyPrivate
export _root_.gio.structs._GDBusObjectSkeleton
export _root_.gio.structs._GDBusObjectSkeletonClass
export _root_.gio.structs._GDBusObjectSkeletonPrivate
export _root_.gio.structs._GDBusPropertyInfo
export _root_.gio.structs._GDBusProxy
export _root_.gio.structs._GDBusProxyClass
export _root_.gio.structs._GDBusProxyPrivate
export _root_.gio.structs._GDBusServer
export _root_.gio.structs._GDBusSignalInfo
export _root_.gio.structs._GDBusSubtreeVTable
export _root_.gio.structs._GDataInputStream
export _root_.gio.structs._GDataInputStreamClass
export _root_.gio.structs._GDataInputStreamPrivate
export _root_.gio.structs._GDataOutputStream
export _root_.gio.structs._GDataOutputStreamClass
export _root_.gio.structs._GDataOutputStreamPrivate
export _root_.gio.structs._GDatagramBased
export _root_.gio.structs._GDatagramBasedInterface
export _root_.gio.structs._GDebugController
export _root_.gio.structs._GDebugControllerDBus
export _root_.gio.structs._GDebugControllerDBusClass
export _root_.gio.structs._GDebugControllerInterface
export _root_.gio.structs._GDrive
export _root_.gio.structs._GDriveIface
export _root_.gio.structs._GDtlsClientConnection
export _root_.gio.structs._GDtlsClientConnectionInterface
export _root_.gio.structs._GDtlsConnection
export _root_.gio.structs._GDtlsConnectionInterface
export _root_.gio.structs._GDtlsServerConnection
export _root_.gio.structs._GDtlsServerConnectionInterface
export _root_.gio.structs._GEmblem
export _root_.gio.structs._GEmblemClass
export _root_.gio.structs._GEmblemedIcon
export _root_.gio.structs._GEmblemedIconClass
export _root_.gio.structs._GEmblemedIconPrivate
export _root_.gio.structs._GFile
export _root_.gio.structs._GFileAttributeInfo
export _root_.gio.structs._GFileAttributeInfoList
export _root_.gio.structs._GFileAttributeMatcher
export _root_.gio.structs._GFileDescriptorBased
export _root_.gio.structs._GFileEnumerator
export _root_.gio.structs._GFileEnumeratorClass
export _root_.gio.structs._GFileEnumeratorPrivate
export _root_.gio.structs._GFileIOStream
export _root_.gio.structs._GFileIOStreamClass
export _root_.gio.structs._GFileIOStreamPrivate
export _root_.gio.structs._GFileIcon
export _root_.gio.structs._GFileIconClass
export _root_.gio.structs._GFileIface
export _root_.gio.structs._GFileInfo
export _root_.gio.structs._GFileInfoClass
export _root_.gio.structs._GFileInputStream
export _root_.gio.structs._GFileInputStreamClass
export _root_.gio.structs._GFileInputStreamPrivate
export _root_.gio.structs._GFileMonitor
export _root_.gio.structs._GFileMonitorClass
export _root_.gio.structs._GFileMonitorPrivate
export _root_.gio.structs._GFileOutputStream
export _root_.gio.structs._GFileOutputStreamClass
export _root_.gio.structs._GFileOutputStreamPrivate
export _root_.gio.structs._GFilenameCompleter
export _root_.gio.structs._GFilenameCompleterClass
export _root_.gio.structs._GFilterInputStream
export _root_.gio.structs._GFilterInputStreamClass
export _root_.gio.structs._GFilterOutputStream
export _root_.gio.structs._GFilterOutputStreamClass
export _root_.gio.structs._GIOExtension
export _root_.gio.structs._GIOExtensionPoint
export _root_.gio.structs._GIOModule
export _root_.gio.structs._GIOModuleClass
export _root_.gio.structs._GIOModuleScope
export _root_.gio.structs._GIOSchedulerJob
export _root_.gio.structs._GIOStream
export _root_.gio.structs._GIOStreamAdapter
export _root_.gio.structs._GIOStreamClass
export _root_.gio.structs._GIOStreamPrivate
export _root_.gio.structs._GIcon
export _root_.gio.structs._GIconIface
export _root_.gio.structs._GInetAddress
export _root_.gio.structs._GInetAddressClass
export _root_.gio.structs._GInetAddressMask
export _root_.gio.structs._GInetAddressMaskClass
export _root_.gio.structs._GInetAddressMaskPrivate
export _root_.gio.structs._GInetAddressPrivate
export _root_.gio.structs._GInetSocketAddress
export _root_.gio.structs._GInetSocketAddressClass
export _root_.gio.structs._GInetSocketAddressPrivate
export _root_.gio.structs._GInitable
export _root_.gio.structs._GInitableIface
export _root_.gio.structs._GInputMessage
export _root_.gio.structs._GInputStream
export _root_.gio.structs._GInputStreamClass
export _root_.gio.structs._GInputStreamPrivate
export _root_.gio.structs._GInputVector
export _root_.gio.structs._GListModel
export _root_.gio.structs._GListModelInterface
export _root_.gio.structs._GListStore
export _root_.gio.structs._GLoadableIcon
export _root_.gio.structs._GLoadableIconIface
export _root_.gio.structs._GMemoryInputStream
export _root_.gio.structs._GMemoryInputStreamClass
export _root_.gio.structs._GMemoryInputStreamPrivate
export _root_.gio.structs._GMemoryMonitor
export _root_.gio.structs._GMemoryMonitorInterface
export _root_.gio.structs._GMemoryOutputStream
export _root_.gio.structs._GMemoryOutputStreamClass
export _root_.gio.structs._GMemoryOutputStreamPrivate
export _root_.gio.structs._GMenu
export _root_.gio.structs._GMenuAttributeIter
export _root_.gio.structs._GMenuAttributeIterClass
export _root_.gio.structs._GMenuAttributeIterPrivate
export _root_.gio.structs._GMenuItem
export _root_.gio.structs._GMenuLinkIter
export _root_.gio.structs._GMenuLinkIterClass
export _root_.gio.structs._GMenuLinkIterPrivate
export _root_.gio.structs._GMenuModel
export _root_.gio.structs._GMenuModelClass
export _root_.gio.structs._GMenuModelPrivate
export _root_.gio.structs._GMount
export _root_.gio.structs._GMountIface
export _root_.gio.structs._GMountOperation
export _root_.gio.structs._GMountOperationClass
export _root_.gio.structs._GMountOperationPrivate
export _root_.gio.structs._GNativeSocketAddress
export _root_.gio.structs._GNativeSocketAddressClass
export _root_.gio.structs._GNativeSocketAddressPrivate
export _root_.gio.structs._GNativeVolumeMonitor
export _root_.gio.structs._GNativeVolumeMonitorClass
export _root_.gio.structs._GNetworkAddress
export _root_.gio.structs._GNetworkAddressClass
export _root_.gio.structs._GNetworkAddressPrivate
export _root_.gio.structs._GNetworkMonitor
export _root_.gio.structs._GNetworkMonitorInterface
export _root_.gio.structs._GNetworkService
export _root_.gio.structs._GNetworkServiceClass
export _root_.gio.structs._GNetworkServicePrivate
export _root_.gio.structs._GNotification
export _root_.gio.structs._GOutputMessage
export _root_.gio.structs._GOutputStream
export _root_.gio.structs._GOutputStreamClass
export _root_.gio.structs._GOutputStreamPrivate
export _root_.gio.structs._GOutputVector
export _root_.gio.structs._GPermission
export _root_.gio.structs._GPermissionClass
export _root_.gio.structs._GPermissionPrivate
export _root_.gio.structs._GPollableInputStream
export _root_.gio.structs._GPollableInputStreamInterface
export _root_.gio.structs._GPollableOutputStream
export _root_.gio.structs._GPollableOutputStreamInterface
export _root_.gio.structs._GPowerProfileMonitor
export _root_.gio.structs._GPowerProfileMonitorInterface
export _root_.gio.structs._GPropertyAction
export _root_.gio.structs._GProxy
export _root_.gio.structs._GProxyAddress
export _root_.gio.structs._GProxyAddressClass
export _root_.gio.structs._GProxyAddressEnumerator
export _root_.gio.structs._GProxyAddressEnumeratorClass
export _root_.gio.structs._GProxyAddressEnumeratorPrivate
export _root_.gio.structs._GProxyAddressPrivate
export _root_.gio.structs._GProxyInterface
export _root_.gio.structs._GProxyResolver
export _root_.gio.structs._GProxyResolverInterface
export _root_.gio.structs._GRemoteActionGroup
export _root_.gio.structs._GRemoteActionGroupInterface
export _root_.gio.structs._GResolver
export _root_.gio.structs._GResolverClass
export _root_.gio.structs._GResolverPrivate
export _root_.gio.structs._GResource
export _root_.gio.structs._GSeekable
export _root_.gio.structs._GSeekableIface
export _root_.gio.structs._GSettings
export _root_.gio.structs._GSettingsBackend
export _root_.gio.structs._GSettingsClass
export _root_.gio.structs._GSettingsPrivate
export _root_.gio.structs._GSettingsSchema
export _root_.gio.structs._GSettingsSchemaKey
export _root_.gio.structs._GSettingsSchemaSource
export _root_.gio.structs._GSimpleAction
export _root_.gio.structs._GSimpleActionGroup
export _root_.gio.structs._GSimpleActionGroupClass
export _root_.gio.structs._GSimpleActionGroupPrivate
export _root_.gio.structs._GSimpleAsyncResult
export _root_.gio.structs._GSimpleAsyncResultClass
export _root_.gio.structs._GSimpleIOStream
export _root_.gio.structs._GSimplePermission
export _root_.gio.structs._GSimpleProxyResolver
export _root_.gio.structs._GSimpleProxyResolverClass
export _root_.gio.structs._GSimpleProxyResolverPrivate
export _root_.gio.structs._GSocket
export _root_.gio.structs._GSocketAddress
export _root_.gio.structs._GSocketAddressClass
export _root_.gio.structs._GSocketAddressEnumerator
export _root_.gio.structs._GSocketAddressEnumeratorClass
export _root_.gio.structs._GSocketClass
export _root_.gio.structs._GSocketClient
export _root_.gio.structs._GSocketClientClass
export _root_.gio.structs._GSocketClientPrivate
export _root_.gio.structs._GSocketConnectable
export _root_.gio.structs._GSocketConnectableIface
export _root_.gio.structs._GSocketConnection
export _root_.gio.structs._GSocketConnectionClass
export _root_.gio.structs._GSocketConnectionPrivate
export _root_.gio.structs._GSocketControlMessage
export _root_.gio.structs._GSocketControlMessageClass
export _root_.gio.structs._GSocketControlMessagePrivate
export _root_.gio.structs._GSocketListener
export _root_.gio.structs._GSocketListenerClass
export _root_.gio.structs._GSocketListenerPrivate
export _root_.gio.structs._GSocketPrivate
export _root_.gio.structs._GSocketService
export _root_.gio.structs._GSocketServiceClass
export _root_.gio.structs._GSocketServicePrivate
export _root_.gio.structs._GSrvTarget
export _root_.gio.structs._GStaticResource
export _root_.gio.structs._GSubprocess
export _root_.gio.structs._GSubprocessLauncher
export _root_.gio.structs._GTask
export _root_.gio.structs._GTaskClass
export _root_.gio.structs._GTcpConnection
export _root_.gio.structs._GTcpConnectionClass
export _root_.gio.structs._GTcpConnectionPrivate
export _root_.gio.structs._GTcpWrapperConnection
export _root_.gio.structs._GTcpWrapperConnectionClass
export _root_.gio.structs._GTcpWrapperConnectionPrivate
export _root_.gio.structs._GTestDBus
export _root_.gio.structs._GThemedIcon
export _root_.gio.structs._GThemedIconClass
export _root_.gio.structs._GThreadedSocketService
export _root_.gio.structs._GThreadedSocketServiceClass
export _root_.gio.structs._GThreadedSocketServicePrivate
export _root_.gio.structs._GTlsBackend
export _root_.gio.structs._GTlsBackendInterface
export _root_.gio.structs._GTlsCertificate
export _root_.gio.structs._GTlsCertificateClass
export _root_.gio.structs._GTlsCertificatePrivate
export _root_.gio.structs._GTlsClientConnection
export _root_.gio.structs._GTlsClientConnectionInterface
export _root_.gio.structs._GTlsConnection
export _root_.gio.structs._GTlsConnectionClass
export _root_.gio.structs._GTlsConnectionPrivate
export _root_.gio.structs._GTlsDatabase
export _root_.gio.structs._GTlsDatabaseClass
export _root_.gio.structs._GTlsDatabasePrivate
export _root_.gio.structs._GTlsFileDatabase
export _root_.gio.structs._GTlsFileDatabaseInterface
export _root_.gio.structs._GTlsInteraction
export _root_.gio.structs._GTlsInteractionClass
export _root_.gio.structs._GTlsInteractionPrivate
export _root_.gio.structs._GTlsPassword
export _root_.gio.structs._GTlsPasswordClass
export _root_.gio.structs._GTlsPasswordPrivate
export _root_.gio.structs._GTlsServerConnection
export _root_.gio.structs._GTlsServerConnectionInterface
export _root_.gio.structs._GUnixCredentialsMessage
export _root_.gio.structs._GUnixFDList
export _root_.gio.structs._GVfs
export _root_.gio.structs._GVfsClass
export _root_.gio.structs._GVolume
export _root_.gio.structs._GVolumeIface
export _root_.gio.structs._GVolumeMonitor
export _root_.gio.structs._GVolumeMonitorClass
export _root_.gio.structs._GZlibCompressor
export _root_.gio.structs._GZlibCompressorClass
export _root_.gio.structs._GZlibDecompressor
export _root_.gio.structs._GZlibDecompressorClass