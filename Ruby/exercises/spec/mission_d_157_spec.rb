require './app/mission_d_157.rb'

describe '組み合わせ数チェック' do
  describe '出力結果のテスト' do
    let(:missionD157) { MissionD157.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets) { "3\n" }
      expect($stdout).to receive(:puts).with(8)
      missionD157.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets) { "5\n" }
      expect($stdout).to receive(:puts).with(32)
      missionD157.run
    end
  end
end
