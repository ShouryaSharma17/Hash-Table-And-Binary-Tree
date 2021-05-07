package com.datastructures;

public interface INode<K> {
    K getData();
    void setData(K key);

    INode getNext();
    void setNext(INode next);

}
