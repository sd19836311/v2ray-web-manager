// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/proxy/socks/config.proto

package com.v2ray.core.proxy.socks;

public final class Config {
    private Config() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_v2ray_core_proxy_socks_Account_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_v2ray_core_proxy_socks_Account_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_v2ray_core_proxy_socks_ServerConfig_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_v2ray_core_proxy_socks_ServerConfig_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_v2ray_core_proxy_socks_ServerConfig_AccountsEntry_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_v2ray_core_proxy_socks_ServerConfig_AccountsEntry_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_v2ray_core_proxy_socks_ClientConfig_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_v2ray_core_proxy_socks_ClientConfig_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        String[] descriptorData = {
                "\n\'v2ray.com/core/proxy/socks/config.prot" +
                        "o\022\026v2ray.core.proxy.socks\032\'v2ray.com/cor" +
                        "e/common/net/address.proto\0320v2ray.com/co" +
                        "re/common/protocol/server_spec.proto\"-\n\007" +
                        "Account\022\020\n\010username\030\001 \001(\t\022\020\n\010password\030\002 " +
                        "\001(\t\"\254\002\n\014ServerConfig\0223\n\tauth_type\030\001 \001(\0162" +
                        " .v2ray.core.proxy.socks.AuthType\022D\n\010acc" +
                        "ounts\030\002 \003(\01322.v2ray.core.proxy.socks.Ser" +
                        "verConfig.AccountsEntry\0222\n\007address\030\003 \001(\013" +
                        "2!.v2ray.core.common.net.IPOrDomain\022\023\n\013u" +
                        "dp_enabled\030\004 \001(\010\022\023\n\007timeout\030\005 \001(\rB\002\030\001\022\022\n" +
                        "\nuser_level\030\006 \001(\r\032/\n\rAccountsEntry\022\013\n\003ke" +
                        "y\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"J\n\014ClientConf" +
                        "ig\022:\n\006server\030\001 \003(\0132*.v2ray.core.common.p" +
                        "rotocol.ServerEndpoint*%\n\010AuthType\022\013\n\007NO" +
                        "_AUTH\020\000\022\014\n\010PASSWORD\020\001B>\n\032com.v2ray.core." +
                        "proxy.socksP\001Z\005socks\252\002\026V2Ray.Core.Proxy." +
                        "Socksb\006proto3"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                                com.v2ray.core.common.net.Address.getDescriptor(),
                                com.v2ray.core.common.protocol.ServerSpec.getDescriptor(),
                        }, assigner);
        internal_static_v2ray_core_proxy_socks_Account_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_v2ray_core_proxy_socks_Account_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_v2ray_core_proxy_socks_Account_descriptor,
                new String[]{"Username", "Password",});
        internal_static_v2ray_core_proxy_socks_ServerConfig_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_v2ray_core_proxy_socks_ServerConfig_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_v2ray_core_proxy_socks_ServerConfig_descriptor,
                new String[]{"AuthType", "Accounts", "Address", "UdpEnabled", "Timeout", "UserLevel",});
        internal_static_v2ray_core_proxy_socks_ServerConfig_AccountsEntry_descriptor =
                internal_static_v2ray_core_proxy_socks_ServerConfig_descriptor.getNestedTypes().get(0);
        internal_static_v2ray_core_proxy_socks_ServerConfig_AccountsEntry_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_v2ray_core_proxy_socks_ServerConfig_AccountsEntry_descriptor,
                new String[]{"Key", "Value",});
        internal_static_v2ray_core_proxy_socks_ClientConfig_descriptor =
                getDescriptor().getMessageTypes().get(2);
        internal_static_v2ray_core_proxy_socks_ClientConfig_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_v2ray_core_proxy_socks_ClientConfig_descriptor,
                new String[]{"Server",});
        com.v2ray.core.common.net.Address.getDescriptor();
        com.v2ray.core.common.protocol.ServerSpec.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
