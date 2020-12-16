package com.example.demo_02;

import java.util.List;

public class JavaBean {

    /**
     * error : false
     * results : [{"_id":"56cc6d1c421aa95caa707534","createdAt":"2015-11-13T03:57:41.206Z","desc":"11.13","publishedAt":"2015-11-13T04:03:12.613Z","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bgw1exz7lm0ow0j20qo0hrjud.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d23421aa95caa707994","createdAt":"2015-11-12T03:27:15.775Z","desc":"11.12","publishedAt":"2015-11-12T13:46:23.466Z","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bjw1exy13si92lj20v218g10h.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d23421aa95caa70798a","createdAt":"2015-11-11T02:24:33.366Z","desc":"11.11","publishedAt":"2015-11-11T03:47:41.135Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1exwto3cm5xj20nm0kq7a3.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d23421aa95caa707980","createdAt":"2015-11-10T01:45:59.392Z","desc":"11.10","publishedAt":"2015-11-10T05:37:51.792Z","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1exvmxmy36wj20ru114gqq.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d23421aa95caa707979","createdAt":"2015-11-09T03:37:04.87Z","desc":"11.9","publishedAt":"2015-11-09T04:20:34.123Z","type":"福利","url":"http://ww3.sinaimg.cn/large/a3bcec5fjw1exukiyu2zoj20hs0qo0w9.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1c421aa95caa70752b","createdAt":"2015-11-06T01:54:17.536Z","desc":"11.6","publishedAt":"2015-11-06T04:11:25.973Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1exr0p4r0h3j20oy15445o.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1c421aa95caa707523","createdAt":"2015-11-04T10:33:50.564Z","desc":"11.5","publishedAt":"2015-11-05T04:02:52.968Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1exp4h479xfj20hs0qoq6t.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1c421aa95caa70750f","createdAt":"2015-11-04T03:20:20.50Z","desc":"11.4","publishedAt":"2015-11-04T04:01:55.601Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1exory1k01ej20go0gnjv8.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa7075b1","createdAt":"2015-11-02T23:46:36.247Z","desc":"11.3","publishedAt":"2015-11-03T06:04:59.454Z","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bjw1exng5dd728j20go0m877n.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa7075a6","createdAt":"2015-11-02T03:53:25.557Z","desc":"11.2","publishedAt":"2015-11-02T04:16:06.443Z","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bgw1exmhnx76z9j20go0dcabp.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa70758f","createdAt":"2015-10-30T01:54:13.811Z","desc":"10.30","publishedAt":"2015-10-30T03:50:54.394Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1exixcxfj12j20in0rsgp0.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa70757d","createdAt":"2015-10-29T01:49:31.473Z","desc":"10.29","publishedAt":"2015-10-29T04:40:26.424Z","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bjw1exhrgo769bj20ox0zk42e.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa707573","createdAt":"2015-10-28T03:38:43.164Z","desc":"10.28","publishedAt":"2015-10-28T03:51:19.336Z","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bjw1exgp509vvxj20fr0nm786.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa70755f","createdAt":"2015-10-27T01:17:26.385Z","desc":"10.27","publishedAt":"2015-10-27T02:43:16.906Z","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bjw1exfffnlf2gj20hq0qoju9.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa70755a","createdAt":"2015-10-26T01:16:49.787Z","desc":"10.26","publishedAt":"2015-10-26T03:52:58.746Z","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1exe9ssy2gsj20qo0hndjr.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d23421aa95caa707966","createdAt":"2015-10-23T02:28:08.529Z","desc":"10.23","publishedAt":"2015-10-23T04:01:16.227Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1exav03j43nj20hs0qoq79.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d23421aa95caa70795a","createdAt":"2015-10-22T01:26:58.313Z","desc":"10.22","publishedAt":"2015-10-22T02:06:07.752Z","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bjw1ex9nm11pbnj20hs0qo0u2.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d23421aa95caa707953","createdAt":"2015-10-21T00:56:57.614Z","desc":"10.21","publishedAt":"2015-10-21T02:57:40.912Z","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bjw1ex8h4lnq3oj20hs0qoadj.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d23421aa95caa70794c","createdAt":"2015-10-20T01:03:11.760Z","desc":"10.20\n","publishedAt":"2015-10-20T03:45:36.980Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1ex7bos9alqj20hs0qoq7g.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d22421aa95caa707947","createdAt":"2015-10-19T01:26:51.154Z","desc":"10.19","publishedAt":"2015-10-19T03:47:21.647Z","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bgw1ex66r1sk5wj20et0m8q4q.jpg","used":true,"who":"张涵宇"}]
     */

    private boolean error;
    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * _id : 56cc6d1c421aa95caa707534
         * createdAt : 2015-11-13T03:57:41.206Z
         * desc : 11.13
         * publishedAt : 2015-11-13T04:03:12.613Z
         * type : 福利
         * url : http://ww3.sinaimg.cn/large/7a8aed7bgw1exz7lm0ow0j20qo0hrjud.jpg
         * used : true
         * who : 张涵宇
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String type;
        private String url;
        private boolean used;
        private String who;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }
    }
}
