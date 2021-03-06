package com.example.proxydemo.dynamicproxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Objects;

public class Proxy {
//    public static Object newProxyInstance(ClassLoader loader,
//                                          Class<?>[] interfaces,
//                                          InvocationHandler h)
//            throws IllegalArgumentException
//    {
//        Objects.requireNonNull(h);
//
//        final Class<?>[] intfs = interfaces.clone();
//        final SecurityManager sm = System.getSecurityManager();
//        if (sm != null) {
//            checkProxyAccess(Reflection.getCallerClass(), loader, intfs);
//        }
//
//        /*
//         * Look up or generate the designated proxy class.
//         */
//        Class<?> cl = getProxyClass0(loader, intfs);
//
//        /*
//         * Invoke its constructor with the designated invocation handler.
//         */
//        try {
//            if (sm != null) {
//                checkNewProxyPermission(Reflection.getCallerClass(), cl);
//            }
//
//            final Constructor<?> cons = cl.getConstructor(constructorParams);
//            final InvocationHandler ih = h;
//            if (!Modifier.isPublic(cl.getModifiers())) {
//                AccessController.doPrivileged(new PrivilegedAction<Void>() {
//                    public Void run() {
//                        cons.setAccessible(true);
//                        return null;
//                    }
//                });
//            }
//            return cons.newInstance(new Object[]{h});
//        } catch (IllegalAccessException|InstantiationException e) {
//            throw new InternalError(e.toString(), e);
//        } catch (InvocationTargetException e) {
//            Throwable t = e.getCause();
//            if (t instanceof RuntimeException) {
//                throw (RuntimeException) t;
//            } else {
//                throw new InternalError(t.toString(), t);
//            }
//        } catch (NoSuchMethodException e) {
//            throw new InternalError(e.toString(), e);
//        }
//    }
}
