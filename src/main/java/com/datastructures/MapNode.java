package com.datastructures;

public class MapNode<K, V> extends LinkedList implements INode<K> {
    K key;
    V value;
    MapNode<K,V> next;

    public MapNode(K key, V value){
        this.key = key;
        this.value = value;
        next = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public INode getNext() {
        return next;
    }

    @Override
    public void setNext(INode next) {
        this.next = (MapNode<K, V>) next;
    }

    public V getValue(){
        return value ;
    }

    public void setValue(V value){
        this.value = value;
    }

    public String toString(){
        StringBuilder mapNodeString = new StringBuilder();
        mapNodeString.append("MapNode {" + "K=").append(key)
                .append("V= ").append(value).append("}");
        if(next != null) {
            mapNodeString.append(" -> ").append(next);
        }
        return mapNodeString.toString();
    }
}

