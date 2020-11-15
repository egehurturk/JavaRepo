package com.abstractchallenge;

public class LinkingList implements NodeList{
    private ListItem root = null;

    public LinkingList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            // list was empty, item becomes the head
            this.root = newItem;
            return true;
        }
        ListItem current = this.root;
        while (current.next() != null) {
            int comparison = (current.compareTo(newItem));
            if (comparison < 0) {
                // newItem is greator
                if (current.next() != null) {
                    current = current.next();
                } else {
                    // reached end
                    current.setNext(newItem).setPrevious(current);
                    return true;
                }
            } else if(comparison > 0) {
                // newItem is less
                if (current.previous() != null) {
                    current.previous().setNext(newItem).setPrevious(current.previous());
                    newItem.setNext(current).setPrevious(newItem);
                } else {
                    // the node w/o a previous is root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                System.out.println(newItem.getValue() + " is already present, not added");
                return false;
            }

        }
        return false;

    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comp = currentItem.compareTo(item);
            if (comp == 0) {
                // found the item to delete
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setNext(currentItem.previous());
                    }
                }
                return true;
            }
            else if (comp < 0) {
                currentItem = currentItem.next();
            } else {
                //comparsion > 0
                // we are at an item grater than the one to be deleted, the item is not in the lit
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem item) {
        if(root == null) {
            System.out.println("List is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
