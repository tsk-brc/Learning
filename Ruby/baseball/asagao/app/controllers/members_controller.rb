class MembersController < ApplicationController
  # before_action :login_required
  # 会員一覧
  def index
    @members = Member.order('number').page(params[:page]).per(15)
  end

  # 検索
  def search
    @members = Member.search(params[:query]).page(params[:page]).per(15)
    render 'index'
  end

  def show
    @member = Member.find(params[:id])
  end
end
