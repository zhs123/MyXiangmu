package bean;

import java.util.List;

/**
 * 1.类的用途
 * 2.@author:zhanghaisheng
 * 3.@2017/2/16
 * 详情页面
 */


public class ShangpingBean {


    /**
     * status : true
     * code : 1
     * message : 调用成功
     * data : {"product":{"id":4,"category_id":1,"image":"","featured_image":null,"image_small":"http://eleteamdata.ygcr8.com/uploads/public/product/xiao-chi/mi-ni-xiao-you-cuan/0.jpg","name":"迷你小肉串(小份)","sort":200,"created_at":20150831,"created_by":10,"updated_at":1483369188,"updated_by":1,"price":"9.00","featured_price":null,"featured_position":null,"featured_position_sort":999,"app_featured_home":null,"app_featured_home_sort":99,"app_featured_image":null,"short_description":"","meta_keywords":"","meta_description":"","is_audit":null,"remarks":null,"featured":null,"description":"","image_medium":"","image_large":"","app_featured_topic":null,"app_featured_topic_sort":99,"app_long_image1":"http://eleteamdata.ygcr8.com/uploads/public/product/xiao-chi/mi-ni-xiao-you-cuan/1.JPG","app_long_image2":"http://eleteamdata.ygcr8.com/uploads/public/product/xiao-chi/mi-ni-xiao-you-cuan/2.JPG","app_long_image3":"http://eleteamdata.ygcr8.com/uploads/public/product/pei-tu/29.jpg","type_id":2,"app_long_image4":"","app_long_image5":"","status":1,"specs_json":"{\"3\":{\"10\":\"微辣\",\"12\":\"加辣\"}}","category":{"id":1,"featured":"0","image":"","featured_image":"","image_small":"","name":"顶级分类","parent_id":"0","sort":999,"created_at":null,"created_by":null,"updated_at":null,"updated_by":null,"short_description":"","app_featured_home":"0","app_featured_home_sort":999,"parent_ids":"","remarks":"","meta_keywords":"","meta_description":"","href":"","href_target":"_blank","image_medium":"","image_large":"","status":1},"productAttrs":[]},"cart_num":0,"product_collected":"1"}
     * share : {}
     */

    private boolean status;
    private int code;
    private String message;
    /**
     * product : {"id":4,"category_id":1,"image":"","featured_image":null,"image_small":"http://eleteamdata.ygcr8.com/uploads/public/product/xiao-chi/mi-ni-xiao-you-cuan/0.jpg","name":"迷你小肉串(小份)","sort":200,"created_at":20150831,"created_by":10,"updated_at":1483369188,"updated_by":1,"price":"9.00","featured_price":null,"featured_position":null,"featured_position_sort":999,"app_featured_home":null,"app_featured_home_sort":99,"app_featured_image":null,"short_description":"","meta_keywords":"","meta_description":"","is_audit":null,"remarks":null,"featured":null,"description":"","image_medium":"","image_large":"","app_featured_topic":null,"app_featured_topic_sort":99,"app_long_image1":"http://eleteamdata.ygcr8.com/uploads/public/product/xiao-chi/mi-ni-xiao-you-cuan/1.JPG","app_long_image2":"http://eleteamdata.ygcr8.com/uploads/public/product/xiao-chi/mi-ni-xiao-you-cuan/2.JPG","app_long_image3":"http://eleteamdata.ygcr8.com/uploads/public/product/pei-tu/29.jpg","type_id":2,"app_long_image4":"","app_long_image5":"","status":1,"specs_json":"{\"3\":{\"10\":\"微辣\",\"12\":\"加辣\"}}","category":{"id":1,"featured":"0","image":"","featured_image":"","image_small":"","name":"顶级分类","parent_id":"0","sort":999,"created_at":null,"created_by":null,"updated_at":null,"updated_by":null,"short_description":"","app_featured_home":"0","app_featured_home_sort":999,"parent_ids":"","remarks":"","meta_keywords":"","meta_description":"","href":"","href_target":"_blank","image_medium":"","image_large":"","status":1},"productAttrs":[]}
     * cart_num : 0
     * product_collected : 1
     */

    private DataBean data;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 4
         * category_id : 1
         * image :
         * featured_image : null
         * image_small : http://eleteamdata.ygcr8.com/uploads/public/product/xiao-chi/mi-ni-xiao-you-cuan/0.jpg
         * name : 迷你小肉串(小份)
         * sort : 200
         * created_at : 20150831
         * created_by : 10
         * updated_at : 1483369188
         * updated_by : 1
         * price : 9.00
         * featured_price : null
         * featured_position : null
         * featured_position_sort : 999
         * app_featured_home : null
         * app_featured_home_sort : 99
         * app_featured_image : null
         * short_description :
         * meta_keywords :
         * meta_description :
         * is_audit : null
         * remarks : null
         * featured : null
         * description :
         * image_medium :
         * image_large :
         * app_featured_topic : null
         * app_featured_topic_sort : 99
         * app_long_image1 : http://eleteamdata.ygcr8.com/uploads/public/product/xiao-chi/mi-ni-xiao-you-cuan/1.JPG
         * app_long_image2 : http://eleteamdata.ygcr8.com/uploads/public/product/xiao-chi/mi-ni-xiao-you-cuan/2.JPG
         * app_long_image3 : http://eleteamdata.ygcr8.com/uploads/public/product/pei-tu/29.jpg
         * type_id : 2
         * app_long_image4 :
         * app_long_image5 :
         * status : 1
         * specs_json : {"3":{"10":"微辣","12":"加辣"}}
         * category : {"id":1,"featured":"0","image":"","featured_image":"","image_small":"","name":"顶级分类","parent_id":"0","sort":999,"created_at":null,"created_by":null,"updated_at":null,"updated_by":null,"short_description":"","app_featured_home":"0","app_featured_home_sort":999,"parent_ids":"","remarks":"","meta_keywords":"","meta_description":"","href":"","href_target":"_blank","image_medium":"","image_large":"","status":1}
         * productAttrs : []
         */

        private ProductBean product;
        private int cart_num;
        private String product_collected;

        public ProductBean getProduct() {
            return product;
        }

        public void setProduct(ProductBean product) {
            this.product = product;
        }

        public int getCart_num() {
            return cart_num;
        }

        public void setCart_num(int cart_num) {
            this.cart_num = cart_num;
        }

        public String getProduct_collected() {
            return product_collected;
        }

        public void setProduct_collected(String product_collected) {
            this.product_collected = product_collected;
        }

        public static class ProductBean {
            private int id;
            private int category_id;
            private String image;
            private Object featured_image;
            private String image_small;
            private String name;
            private int sort;
            private int created_at;
            private int created_by;
            private int updated_at;
            private int updated_by;
            private String price;
            private Object featured_price;
            private Object featured_position;
            private int featured_position_sort;
            private Object app_featured_home;
            private int app_featured_home_sort;
            private Object app_featured_image;
            private String short_description;
            private String meta_keywords;
            private String meta_description;
            private Object is_audit;
            private Object remarks;
            private Object featured;
            private String description;
            private String image_medium;
            private String image_large;
            private Object app_featured_topic;
            private int app_featured_topic_sort;
            private String app_long_image1;
            private String app_long_image2;
            private String app_long_image3;
            private int type_id;
            private String app_long_image4;
            private String app_long_image5;
            private int status;
            private String specs_json;
            /**
             * id : 1
             * featured : 0
             * image :
             * featured_image :
             * image_small :
             * name : 顶级分类
             * parent_id : 0
             * sort : 999
             * created_at : null
             * created_by : null
             * updated_at : null
             * updated_by : null
             * short_description :
             * app_featured_home : 0
             * app_featured_home_sort : 999
             * parent_ids :
             * remarks :
             * meta_keywords :
             * meta_description :
             * href :
             * href_target : _blank
             * image_medium :
             * image_large :
             * status : 1
             */

            private CategoryBean category;
            private List<?> productAttrs;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getCategory_id() {
                return category_id;
            }

            public void setCategory_id(int category_id) {
                this.category_id = category_id;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public Object getFeatured_image() {
                return featured_image;
            }

            public void setFeatured_image(Object featured_image) {
                this.featured_image = featured_image;
            }

            public String getImage_small() {
                return image_small;
            }

            public void setImage_small(String image_small) {
                this.image_small = image_small;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getSort() {
                return sort;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }

            public int getCreated_at() {
                return created_at;
            }

            public void setCreated_at(int created_at) {
                this.created_at = created_at;
            }

            public int getCreated_by() {
                return created_by;
            }

            public void setCreated_by(int created_by) {
                this.created_by = created_by;
            }

            public int getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(int updated_at) {
                this.updated_at = updated_at;
            }

            public int getUpdated_by() {
                return updated_by;
            }

            public void setUpdated_by(int updated_by) {
                this.updated_by = updated_by;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public Object getFeatured_price() {
                return featured_price;
            }

            public void setFeatured_price(Object featured_price) {
                this.featured_price = featured_price;
            }

            public Object getFeatured_position() {
                return featured_position;
            }

            public void setFeatured_position(Object featured_position) {
                this.featured_position = featured_position;
            }

            public int getFeatured_position_sort() {
                return featured_position_sort;
            }

            public void setFeatured_position_sort(int featured_position_sort) {
                this.featured_position_sort = featured_position_sort;
            }

            public Object getApp_featured_home() {
                return app_featured_home;
            }

            public void setApp_featured_home(Object app_featured_home) {
                this.app_featured_home = app_featured_home;
            }

            public int getApp_featured_home_sort() {
                return app_featured_home_sort;
            }

            public void setApp_featured_home_sort(int app_featured_home_sort) {
                this.app_featured_home_sort = app_featured_home_sort;
            }

            public Object getApp_featured_image() {
                return app_featured_image;
            }

            public void setApp_featured_image(Object app_featured_image) {
                this.app_featured_image = app_featured_image;
            }

            public String getShort_description() {
                return short_description;
            }

            public void setShort_description(String short_description) {
                this.short_description = short_description;
            }

            public String getMeta_keywords() {
                return meta_keywords;
            }

            public void setMeta_keywords(String meta_keywords) {
                this.meta_keywords = meta_keywords;
            }

            public String getMeta_description() {
                return meta_description;
            }

            public void setMeta_description(String meta_description) {
                this.meta_description = meta_description;
            }

            public Object getIs_audit() {
                return is_audit;
            }

            public void setIs_audit(Object is_audit) {
                this.is_audit = is_audit;
            }

            public Object getRemarks() {
                return remarks;
            }

            public void setRemarks(Object remarks) {
                this.remarks = remarks;
            }

            public Object getFeatured() {
                return featured;
            }

            public void setFeatured(Object featured) {
                this.featured = featured;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getImage_medium() {
                return image_medium;
            }

            public void setImage_medium(String image_medium) {
                this.image_medium = image_medium;
            }

            public String getImage_large() {
                return image_large;
            }

            public void setImage_large(String image_large) {
                this.image_large = image_large;
            }

            public Object getApp_featured_topic() {
                return app_featured_topic;
            }

            public void setApp_featured_topic(Object app_featured_topic) {
                this.app_featured_topic = app_featured_topic;
            }

            public int getApp_featured_topic_sort() {
                return app_featured_topic_sort;
            }

            public void setApp_featured_topic_sort(int app_featured_topic_sort) {
                this.app_featured_topic_sort = app_featured_topic_sort;
            }

            public String getApp_long_image1() {
                return app_long_image1;
            }

            public void setApp_long_image1(String app_long_image1) {
                this.app_long_image1 = app_long_image1;
            }

            public String getApp_long_image2() {
                return app_long_image2;
            }

            public void setApp_long_image2(String app_long_image2) {
                this.app_long_image2 = app_long_image2;
            }

            public String getApp_long_image3() {
                return app_long_image3;
            }

            public void setApp_long_image3(String app_long_image3) {
                this.app_long_image3 = app_long_image3;
            }

            public int getType_id() {
                return type_id;
            }

            public void setType_id(int type_id) {
                this.type_id = type_id;
            }

            public String getApp_long_image4() {
                return app_long_image4;
            }

            public void setApp_long_image4(String app_long_image4) {
                this.app_long_image4 = app_long_image4;
            }

            public String getApp_long_image5() {
                return app_long_image5;
            }

            public void setApp_long_image5(String app_long_image5) {
                this.app_long_image5 = app_long_image5;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getSpecs_json() {
                return specs_json;
            }

            public void setSpecs_json(String specs_json) {
                this.specs_json = specs_json;
            }

            public CategoryBean getCategory() {
                return category;
            }

            public void setCategory(CategoryBean category) {
                this.category = category;
            }

            public List<?> getProductAttrs() {
                return productAttrs;
            }

            public void setProductAttrs(List<?> productAttrs) {
                this.productAttrs = productAttrs;
            }

            public static class CategoryBean {
                private int id;
                private String featured;
                private String image;
                private String featured_image;
                private String image_small;
                private String name;
                private String parent_id;
                private int sort;
                private Object created_at;
                private Object created_by;
                private Object updated_at;
                private Object updated_by;
                private String short_description;
                private String app_featured_home;
                private int app_featured_home_sort;
                private String parent_ids;
                private String remarks;
                private String meta_keywords;
                private String meta_description;
                private String href;
                private String href_target;
                private String image_medium;
                private String image_large;
                private int status;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getFeatured() {
                    return featured;
                }

                public void setFeatured(String featured) {
                    this.featured = featured;
                }

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getFeatured_image() {
                    return featured_image;
                }

                public void setFeatured_image(String featured_image) {
                    this.featured_image = featured_image;
                }

                public String getImage_small() {
                    return image_small;
                }

                public void setImage_small(String image_small) {
                    this.image_small = image_small;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getParent_id() {
                    return parent_id;
                }

                public void setParent_id(String parent_id) {
                    this.parent_id = parent_id;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public Object getCreated_at() {
                    return created_at;
                }

                public void setCreated_at(Object created_at) {
                    this.created_at = created_at;
                }

                public Object getCreated_by() {
                    return created_by;
                }

                public void setCreated_by(Object created_by) {
                    this.created_by = created_by;
                }

                public Object getUpdated_at() {
                    return updated_at;
                }

                public void setUpdated_at(Object updated_at) {
                    this.updated_at = updated_at;
                }

                public Object getUpdated_by() {
                    return updated_by;
                }

                public void setUpdated_by(Object updated_by) {
                    this.updated_by = updated_by;
                }

                public String getShort_description() {
                    return short_description;
                }

                public void setShort_description(String short_description) {
                    this.short_description = short_description;
                }

                public String getApp_featured_home() {
                    return app_featured_home;
                }

                public void setApp_featured_home(String app_featured_home) {
                    this.app_featured_home = app_featured_home;
                }

                public int getApp_featured_home_sort() {
                    return app_featured_home_sort;
                }

                public void setApp_featured_home_sort(int app_featured_home_sort) {
                    this.app_featured_home_sort = app_featured_home_sort;
                }

                public String getParent_ids() {
                    return parent_ids;
                }

                public void setParent_ids(String parent_ids) {
                    this.parent_ids = parent_ids;
                }

                public String getRemarks() {
                    return remarks;
                }

                public void setRemarks(String remarks) {
                    this.remarks = remarks;
                }

                public String getMeta_keywords() {
                    return meta_keywords;
                }

                public void setMeta_keywords(String meta_keywords) {
                    this.meta_keywords = meta_keywords;
                }

                public String getMeta_description() {
                    return meta_description;
                }

                public void setMeta_description(String meta_description) {
                    this.meta_description = meta_description;
                }

                public String getHref() {
                    return href;
                }

                public void setHref(String href) {
                    this.href = href;
                }

                public String getHref_target() {
                    return href_target;
                }

                public void setHref_target(String href_target) {
                    this.href_target = href_target;
                }

                public String getImage_medium() {
                    return image_medium;
                }

                public void setImage_medium(String image_medium) {
                    this.image_medium = image_medium;
                }

                public String getImage_large() {
                    return image_large;
                }

                public void setImage_large(String image_large) {
                    this.image_large = image_large;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }
            }
        }
    }
}
